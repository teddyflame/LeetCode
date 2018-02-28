package algorithms;


public class Q651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxA(12));
	}
	
	public static int maxA(int N) {
        if(N<=6)return N;
        int res=0;
       // int lastSum = 0;
        for(int y=1;y*3<=(N-3);y++ ){
        	int lastSum=0;
            for(int x=2;x+3*y+1<=N;x++){
                int z=N-x-3*y;
                
                int sum = x;
                int copy=0;
                for(int i=0;i<y;i++){
                	int tmp = (int)Math.pow(2,i)*x;
                    if(i==y-1){    
                        copy = tmp;
                    }  
                    sum+=tmp;
                }
                
                sum+=copy*z;
                System.out.println(x+"+"+y+"+"+z+"="+sum);
                
                if(sum<lastSum){
                	break;
                }
                lastSum = sum;
                res = Math.max(sum,res);
            }
        }
        
        return res;
    }

}
