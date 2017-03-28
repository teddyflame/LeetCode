package algorithms;

public class Q529 {

	public static void main(String[] args) {
		char[][] in={{'E','E','E','E','E'},
				{'E','E','M','E','E'},
				{'E','E','E','E','E'},
				{'E','E','E','E','E'}};
		
		int[] clickPos={3,0};
				

		char[][] out = updateBoard(in, clickPos);
		
		System.out.println(" ");
	}

	public static char[][] updateBoard(char[][] board, int[] click) {
        int i=click[0],j=click[1];
        
        if(board[i][j]=='M'){
        	board[i][j]='X';
        	return board;
        }else{
        	return click(board, i, j);
        }
    }
	
	private static char[][] click(char[][] board,int i,int j){
		int n=board.length,m=board[0].length;
		int count=0;
    	if(i-1>=0){
    		if(j-1>=0 && board[i-1][j-1]=='M')
    			count++;
    		
    		if(board[i-1][j]=='M')
    			count++;
    		if(j+1<m && board[i-1][j+1]=='M')
    			count++;
    	}
    	
    	if(j-1>=0 && board[i][j-1]=='M')
    		count++;
    	if(j+1<m && board[i][j+1]=='M')
    		count++;
    	if(i+1<n){
    		if(j-1>=0 && board[i+1][j-1]=='M')
    			count++;
    		
    		if(board[i+1][j]=='M')
    			count++;
    		if(j+1<m && board[i+1][j+1]=='M')
    			count++;
    	}
    	
    	if(count>0){
    		board[i][j]= (char)(count+48);
    	}else{
    		board[i][j]='B';
    		if(i-1>=0){
        		if(j-1>=0 && board[i-1][j-1]=='E')
        			board=click(board, i-1, j-1);
        		if(board[i-1][j]=='E')
        			board=click(board, i-1, j);
        		if(j+1<m && board[i-1][j+1]=='E')
        			board=click(board, i-1, j+1);
        	}
    		
    		if(j-1>=0 && board[i][j-1]=='E')
    			board=click(board, i, j-1);
        	if(j+1<m && board[i][j+1]=='E')
        		board=click(board, i, j+1);
        	if(i+1<n){
        		if(j-1>=0 && board[i+1][j-1]=='E')
        			board=click(board, i+1, j-1);
        		
        		if(board[i+1][j]=='E')
        			board=click(board, i+1, j);
        		if(j+1<m && board[i+1][j+1]=='E')
        			board=click(board, i+1, j+1);
        	}
    	}
    	return board;
	}
}
