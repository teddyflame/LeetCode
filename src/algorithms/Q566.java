package algorithms;

public class Q566 {

	public static void main(String[] args) {
		
		int[][] in = {{1,2},{3,4}};
		
		int[][] out = matrixReshape(in, 1, 4);
		System.out.println("");
	}
	
	
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int old_row = nums.length;
		
		if(old_row==0){
			return new int[0][0];
		}
        int old_col = nums[0].length;
        if(old_col==0){
        	return new int[0][0];
        }
        
        int size = old_col * old_row;
        
        if((r*c)!=size){
        	return nums;
        }
        
        int[][] res = new int[r][c];
        
        int index_r = 0,index_c=0;
        for(int i=0;i<old_row;i++){
        	for(int j=0;j<old_col;j++){
        		res[index_r][index_c++] = nums[i][j];
        		if(index_c==c){
        			index_c=0;
        			index_r++;
        		}
        	}
        }
//        if((r*c)!=)
        	
        	
        return res;
    }

}
