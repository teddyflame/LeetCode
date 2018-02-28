package algorithms;

public class Q766 {

	public static void main(String[] args) {
		//int[][] in={{1,2},{2,2}};
		int[][] in={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		System.out.println(isToeplitzMatrix(in));
	}
	
	public static boolean isToeplitzMatrix(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;
        
        for(int j=0;j<m;j++){
        	int target = matrix[0][j];
        	int col =j;
        	for(int i=1;i<n;i++){
        		if(++col>=m)break;
        		if(matrix[i][col]!=target)return false;
        	}
        }
        
        for(int i=1;i<n;i++){
        	int target = matrix[i][0];
        	int col = 0;
        	
        	for(int k = i+1;k<n;k++){
        		if(++col>=m)break;
        		if(matrix[k][col]!=target)return false;
        	}
        }
        
        
        return true;
    }

}
