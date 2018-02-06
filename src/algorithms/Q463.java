package algorithms;


public class Q463 {

	public static void main(String[] args) {
//		int[][] a={{0,1,0,0},
//		           {1,1,1,0},
//		           {0,1,0,0},
//		           {1,1,0,0}};
		int[][] a={{1,0}};
//		           {1,1,1,0},
//		           {0,1,0,0},
//		           {1,1,0,0}};
		
		System.out.println(islandPerimeter(a));
	}
	
	public static int islandPerimeter(int[][] grid) {
        int size = grid.length;
        
        int n=grid[0].length;
 //       int m=size/n;
        
        int perimeter=0;
        
        for(int i=0;i<size;i++){
        	for(int j=0;j<n;j++){
        		if(grid[i][j]==1){
        			perimeter+=4;
        			if(i>0&&grid[i-1][j]==1)perimeter-=1;
        			if(i<size-1&&grid[i+1][j]==1)perimeter-=1;
        			if(j>0&&grid[i][j-1]==1)perimeter-=1;
        			if(j<n-1&&grid[i][j+1]==1)perimeter-=1;
        		}
        	}
        }
        
        return perimeter;
    }

}
