package algorithms;

public class Q736 {

	public static void main(String[] args) {
		int[] in = {10,15,20};
		
		System.out.println(minCostClimbingStairs(in));
		

	}
	
	 public static int minCostClimbingStairs(int[] cost) {
	        int N = cost.length;
	        int[][] res = new int[N-1][2];
	        
	        res[0][0] = cost[0];
	        res[0][1] = cost[1];

	        for(int i=1;i<N-1;i++){
	            res[i][0] = Math.min(res[i-1][0] + cost[i],res[i-1][1]);
	            res[i][1] = res[i-1][0]+cost[i+1];            
	        }
	        
	        return Math.min(res[N-2][0]+cost[N-1],res[N-2][1]);
	    }

}
