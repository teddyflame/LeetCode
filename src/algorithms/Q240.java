package algorithms;


public class Q240 {

	public static void main(String[] args) {

		int[][] in = new int[0][0];
		System.out.println(searchMatrix(in,10));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)return false;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0;i<row;i++){
            if(matrix[i][0]>target)break;
            for(int j=0;j<col;j++){
                if(matrix[i][j]>target)break;
                
                if(matrix[i][j]==target)return true;
            }
        }
        
        return false;
    }

}
