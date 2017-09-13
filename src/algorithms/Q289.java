package algorithms;

public class Q289 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int[][] in = {{1,1},{1,0}};
		
		gameOfLife(in);
		
		System.out.println();
	}
	
	 public static void gameOfLife(int[][] board) {
	        int row = board.length;
	        int col = board[0].length;
	        
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	                int num = count(board,i,j);
	                if(board[i][j]==1){
	                    if(num<2 || num>3){
	                        board[i][j]=-1;
	                    }
	                }else{
	                    if(num==3){
	                        board[i][j]=2;
	                    }
	                }
	            }
	        }
	        
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	                if(board[i][j]==-1)board[i][j]=0;
	                if(board[i][j]==2) board[i][j]=1;
	            }
	        }
	    }
	    
	    private static int count(int[][] in,int i,int j){
	        int row = in.length;
	        int col = in[0].length;
	        int num = 0;
	        
	        if(i>0){        //up
	            if(j>0){
	                if(Math.abs(in[i-1][j-1])==1) num++;
	            }
	            
	            if(Math.abs(in[i-1][j])==1) num++;
	                
	            if(j<col-1){
	                if(Math.abs(in[i-1][j+1])==1)num++;   
	            } 
	        }
	        
	        if(j>0 && Math.abs(in[i][j-1])==1)   num++;
	        if(j<col-1 && Math.abs(in[i][j+1])==1)  num++;
	        if(i<row-1){
	            if(j>0 && Math.abs(in[i+1][j-1])==1) num++;
	            if(Math.abs(in[i+1][j])==1) num++;
	            if(j<col-1 && Math.abs(in[i+1][j+1])==1) num++;
	        }
	        
	        return num;
	    }

}
