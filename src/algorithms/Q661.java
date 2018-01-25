package algorithms;

import com.sun.javafx.image.IntPixelAccessor;

public class Q661 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] in = {{1,1,1},{1,0,1},{1,1,1}};
		
		int[][] aaa = imageSmoother(in);
		
		System.out.println("");
		
	}
	
	public static int[][] imageSmoother(int[][] M) {
        int row = M.length;
        int col = M[0].length;
        int[][] res = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                setVal(M,i,j,res);
            }
        }
        
        
        return res;
    }
    
    private static void setVal(int[][] source,int i,int j,int[][] target){
        int sum = source[i][j];
        int count=1;
        
        if(i>0){
            if(j>0){
                sum+=source[i-1][j-1];
                count++;
            }
            sum+=source[i-1][j];
            count++;
            
            if(j<source[0].length-1){
                sum+=source[i-1][j+1];
                count++;
            }
        }
        
        if(j>0){
            sum+=source[i][j-1];
            count++;
        }
        
        if(j<source[0].length-1){
            sum+=source[i][j+1];
            count++;
        }
        
        if(i<source.length-1){
            if(j>0){
                sum+=source[i+1][j-1];
                count++;
            }
            sum+=source[i+1][j];
            count++;
            
            if(j<source[0].length-1){
                sum+=source[i+1][j+1];
                count++;
            }
        }
        
        target[i][j] = sum/count;
    }

}
