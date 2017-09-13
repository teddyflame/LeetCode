package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sun.net.www.content.text.plain;

public class Q64 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] grid = {{1,3,4,3,2},{4,2,5,3,6},{7,5,6,3,1}};
		int out = minPathSum(grid);
		System.out.println();
	}
	
	static  List<int[]> list = new ArrayList<>();
	    public static int minPathSum(int[][] grid) {
	        if(grid==null || grid.length==0){
	            return 0;
	        }

	        int row = grid.length;
	        int col = grid[0].length;
	        
	        if(row==1){
	        	int sum = 0;
	        	for(int i=0;i<col;i++){
	        		sum+=grid[0][i];
	        	}
	        	return sum;
	        }
	        if(col==1){
	        	int sum = 0;
	        	for(int i=0;i<row;i++){
	        		sum+=grid[row][0];
	        	}
	        	return sum;
	        }

	        int[] moves = new int[row+col-2];

	        setMoves(moves,row-1,0);
	        int sum = Integer.MAX_VALUE;
	        for(int i=0;i<list.size();i++){
	        	int[] route = list.get(i);
	        	int routeSum = 0;
	        	int x = 0,y=0;
	        	for(int j=0;j<route.length;j++){
	        		if(route[j]==1){
	        			x++;
	        		}else{
	        			y++;
	        		}
	        		routeSum+= grid[x][y];
	        		if(routeSum>sum)break;
	        	}
	        	
	        	sum = Math.min(sum, routeSum);
	        }
	        return sum + grid[0][0] + grid[row-1][col-1];
	    }
	    private static void setMoves(int[] moves,int num,int index){
	    	if(num<0)return;
	    	if(num==0){
	    		list.add(Arrays.copyOf(moves, moves.length));
	    		return;
	    	}
	    	if(index==moves.length)return;

	    	int[] newMoves = Arrays.copyOf(moves, moves.length);
	    	newMoves[index] = 1;
	    	setMoves(newMoves, num-1, index+1);
	    	newMoves[index] = 0;
	    	setMoves(newMoves, num, index+1);	
	    }
	    
//	    private static void arrange(int[] moves,StringBuilder sb,int k){
//	        if(sb.length()==k){
//	        	String tmp = sb.toString();
//	        	if(list.contains(tmp)){
//	        		list.add(tmp);
//	        	}
//	        	
//	        }
//	        
//	        for(int i=k;i<moves.length;i++){
//	        	sb.append(moves[i]);
//	        	arrange(moves, sb, k+1);
//	        }
//	    }

}
