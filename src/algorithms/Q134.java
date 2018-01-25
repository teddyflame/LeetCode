package algorithms;

public class Q134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] gas = {1,2};
		int[] cost = {2,1};
		
		int result = canCompleteCircuit(gas, cost);
		
		System.out.println("");
	}
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int res = -1;
        for(int i=0;i<gas.length;i++){
            int pos = i;
            tank = 0;
            for(int count=0;count<gas.length;count++){
                tank+=gas[pos];
                
                tank-=cost[pos];
                
                if(tank<0)break;
                if(count==gas.length-1 && tank>=0) res= i;
                
                pos++;
                if(pos==gas.length)pos=0;
            }
        }
        
        return res;
    }

}
