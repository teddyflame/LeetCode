package algorithms;


public class Q547 {

	public static void main(String[] args) {
		int[][] M = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
		
		System.out.println(findCircleNum(M));
	}
	

	public static int findCircleNum(int[][] M) {
        if(M==null || M.length==0)return 0;
        
        int n = M.length;
        int count = n;
        
		int[] id = new int[n];
		int[] sz = new int[n];
		for(int i=0;i<n;i++){
			id[i] =i;
		}

		for(int i=0;i<n;i++){
			sz[i] = 1;
		}

		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(M[i][j]==1){
					count = union(id, sz, i, j, count);
				}
			}
		}
		return count;
	}
	
	private static int find(int[] id, int p){
		while(p!=id[p]){
			id[p]=id[id[p]];
			p=id[p];
		}
		return p;
	}
	
	private static int union(int[] id,int[] sz, int p,int q,int count){
		int i=find(id,p);
		int j=find(id,q);
		
		if(i==j)return count;
		
		//判断谁是小树，让小树作为大树的子树
		if(sz[i]<sz[j]){
			id[i] = j;
			sz[j]+=sz[i];
		}else{
			id[j]=i;
			sz[i]+=sz[j];
		}
		
		return --count;
	}
}
