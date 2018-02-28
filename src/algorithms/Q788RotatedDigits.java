package algorithms;

public class Q788RotatedDigits {

	public static void main(String[] args) {
		
		System.out.println(rotatedDigits(857));
		
	
	}
	
	    public static int rotatedDigits(int N) {
	        int res = 0;
	        for(int i=1;i<=N;i++){
	        	int tmp = rotate(i);
	            if(tmp!=0 && tmp!=i )res++;
	        }
	        
	        return res;
	    }

	    
	    private static int rotate(int num){
	        int res = 0;
	        int mult= 1;
	        while(num>0){
	            int tmp = num%10;
	            if(tmp==3 || tmp==4 || tmp==7){
	                return 0;
	            }else if(tmp == 2){
	                tmp = 5;
	            }else if(tmp ==5){
	                tmp = 2;
	            }else if(tmp ==6){
	                tmp = 9;
	            }else if(tmp ==9){
	                tmp =6;
	            }
	            res += tmp*mult;
	            num/=10;
	            mult*=10;
	        }
	        return res;
	    }

}


