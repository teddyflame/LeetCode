package algorithms;

public class Q598 {

	public static void main(String[] args) {
//int[][]
		System.out.println(maxCount(3, 3, new int[][]{{2,2},{3,3}}));
	}
	
public static int maxCount(int m, int n, int[][] ops) {
        
        
	if(ops==null || ops.length==0){
        return m*n;
    }
    
    int rows = Integer.MAX_VALUE, cols = Integer.MIN_VALUE;
    
    for(int[] a :ops){
        rows = Math.min(rows,a[0]);
        cols = Math.min(cols,a[1]);
    }
    
    return rows*cols;
    }

}
