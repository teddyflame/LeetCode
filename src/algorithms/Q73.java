package algorithms;

import java.util.HashSet;
import java.util.Iterator;

public class Q73 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [][] in = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		setZeroes(in);
		
		System.out.println("");
	}
	
	public static void setZeroes(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)return;
        
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0;i<row;i++){
        //    if(rowSet.contains(i))continue;
            for(int j=0;j<col;j++){
        //        if(colSet.contains(j))continue;
                
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        
        Iterator<Integer> iter = rowSet.iterator();
        
        while(iter.hasNext()){
            int rowIndex = iter.next();
            for(int i=0;i<col;i++){
                matrix[rowIndex][i] = 0;
            }
        }
        
        iter = colSet.iterator();
        while(iter.hasNext()){
            int colIndex = iter.next();
            for(int i=0;i<row;i++){
                matrix[i][colIndex] = 0;
            }
        }
    }

}
