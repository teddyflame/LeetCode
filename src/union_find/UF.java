package union_find;



/**
 * Union-Find算法的三种形态
 * @author Administrator
 *
 */
public class UF {
	
	private int[] id;	//每个单元的组号
	private int[] sz;	//用来储存每个组的大小
	private int count; //总数
	
	//初始化
	public UF(int N){
		
		count = N;
		id = new int[N];
		sz = new int[N];
		for(int i=0;i<N;i++){
			id[i] =i;
		}
		
		//初始情况下，各个组的大小都是1
		for(int i=0;i<N;i++){
			sz[i] = 1;
		}
	}
	
	public int count(){
		return count;
	}
	
	public boolean connected(int p, int q){
		return find(p)==find(q);
	}
	
	public int find(int p){
		/*
		 * quick-find
		 */
		//return id[p];
		
		/*
		 * Quick-union
		 */
		// 寻找p节点所在组的根节点，
		//根节点具有性质id[root] = root  
//		while(p!=id[p]){
//			p=id[p];
//		}
//		
//		return p;
		
		/*
		 * union-find
		 */
		while(p!=id[p]){
			//将p节点的父节点设置为它的爷爷节点
			//相当于在寻找根节点的同时，对路径进行压缩
			//使得树扁平化
			id[p]=id[id[p]];
			p=id[p];
		}
		return p;
		
	}
	
	public void union (int p,int q){
		/*
		 * Quick -Find 方法
		 */
//		int pID = find(p);
//		int qID = find(q);
//		
//		if(pID==qID){
//			return;
//		}
//		
		//这里是弱点： 每个关系的改变都要遍历所有成员，
		//更新所有组信息
//		for(int i=0;i<id.length;i++){
//			if(id[i]==qID){
//				id[i]=pID;
//			}
//			count--;
//		}
		
		/*
		 * quick - union 方法
		 */

//		int pRoot = find(p);
//		int qRoot = find(q);
//		
//		if(pRoot==qRoot)return;
//		
//		//将一颗树(即一个组)变成另外一棵树(即一个组)的子树
//		//这里是弱点：有可能让一个大树成为一个小树的子集，
//		//导致树不平衡（过深）
//		id[pRoot] = qRoot;
//		count--;
		
		/*
		 * union-find
		 */
		int i=find(p);
		int j=find(q);
		
		if(i==j)return;
		
		//判断谁是小树，让小树作为大树的子树
		if(sz[i]<sz[j]){
			id[i] = j;
			sz[j]+=sz[i];
		}else{
			id[j]=i;
			sz[i]+=sz[j];
		}
		
		count--;
		
	}

}
