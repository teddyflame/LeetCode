package algorithms;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome(-2147447412));
	}
	
	 public static boolean isPalindrome(int x) {
		 	x=Math.abs(x);
	        int n=countLen(x);
	        
	        int v;
	        
	        for(int i=0;i<n/2;i++){
	        	v=(int)Math.pow(10, n-i*2-1);
	        	
	        	if(x%10!=x/v){
	        		return false;
	        	}
	        	
	        	x=x%v/10;
	        }
	        
	        return true;
	    }
	 
	 public static int countLen(int num){
			
			int count =0;
			
			while(true){
				if(num/10==0&&num%10==0){
					break;
				}
				
				count++;
				num=num/10;
			}

			return count;
		}

}
