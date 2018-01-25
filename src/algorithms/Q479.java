package algorithms;

public class Q479 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(largestPalindrome(8));
	}
	
	 public static int largestPalindrome2(int n) {
	        // if input is 1 then max is 9 
	        if(n == 1){
	            return 9;
	        }
	        
	        // if n = 3 then upperBound = 999 and lowerBound = 99
	        int upperBound = (int) Math.pow(10, n) - 1, lowerBound = upperBound / 10;
	        long maxNumber = (long) upperBound * (long) upperBound;
	        
	        // represents the first half of the maximum assumed palindrom.
	        // e.g. if n = 3 then maxNumber = 999 x 999 = 998001 so firstHalf = 998
	        int firstHalf = (int)(maxNumber / (long) Math.pow(10, n));
	        
	        boolean palindromFound = false;
	        long palindrom = 0;
	        
	        while (!palindromFound) {
	            // creates maximum assumed palindrom
	            // e.g. if n = 3 first time the maximum assumed palindrom will be 998 899
	            palindrom = createPalindrom(firstHalf);
	            
	            // here i and palindrom/i forms the two factor of assumed palindrom
	            for (long i = upperBound; upperBound > lowerBound; i--) {
	                // if n= 3 none of the factor of palindrom  can be more than 999 or less than square root of assumed palindrom 
	                if (palindrom / i > maxNumber || i * i < palindrom) {
	                    break;
	                }
	                
	                // if two factors found, where both of them are n-digits,
	                if (palindrom % i == 0) {
	                    palindromFound = true;
	                    System.out.println(palindrom +"=" + i+"/" +palindrom/i);
	                    break;
	                }
	            }

	            firstHalf--;
	        }

	        return (int) (palindrom % 1337);
	    }
	 
	  private static long createPalindrom(long num) {
	        String str = num + new StringBuilder().append(num).reverse().toString();
	        return Long.parseLong(str);
	    }
	
	 public static int largestPalindrome(int n) {
		 	double max = (Math.pow(10,n)-1) * (Math.pow(10,n)-1);
		 	int firstHalf = (int)(max/Math.pow(10, n));
		 	
		 	while(true){
		 		long palindoromeNum = makeNumber(n,firstHalf);
		 		if(firstHalf==99660){
		 			System.out.println(" ");
		 		}
		 		System.out.println(palindoromeNum);
		 		
		 		for(long i=(int)(Math.pow(10,n)-1);i>=Math.pow(10, n-1);i--){
		 			long mult = i*i;
		 			//System.out.println(palindoromeNum/i+">" +max+"? " + ((palindoromeNum/i)>max));
		 			//System.out.println((i*i)+"<"+palindoromeNum+"? , "  +((mult) <palindoromeNum));
		 			
		 			
		 			if(((palindoromeNum/i)>max) || (mult <palindoromeNum)){
	                    break;
	                }
		 			if(palindoromeNum%i==0){
		 				System.out.println(palindoromeNum+"=" + i + "/" +palindoromeNum/i);
		 				return (int) (palindoromeNum%1337);
		 			}
		 		}
		 		
		 		firstHalf--;
		 	}

	    }
	 
	 private static long makeNumber(int n,int firstHalf){
		 //double firstHalf = Math.pow(10,n)-1;
		 
		 long res = firstHalf * (long)Math.pow(10, n);
		 
		 for(int i=1;i<=n;i++){
			 int tmp = firstHalf%10;
			 res += tmp*(long)Math.pow(10, n-i);
			 firstHalf/=10;
		 }
		 
		 return res;
	 }
	    
	

}
