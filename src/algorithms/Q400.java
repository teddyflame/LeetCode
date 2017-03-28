package algorithms;

public class Q400 {

	public static void main(String[] args) {
		System.out.println(findNthDigit(1000000000));
	}
	
	public static int findNthDigit(int n) {
		
		if(n<0){
			return 0;
		}else if(n<=9){
			return n;
		}else{
			return judge(n-9, 2);
		}
        
    }
	
	private static int judge(int n,int level){
		double range = 9*level * (Math.pow(10,level-1));
		
		if(n>range){
			return judge((int)(n-range), level+1);
		}else{
			int number = (int)(Math.pow(10, level-1)) 
					+ (n-1)/level;
			
			int location = level-n%level;
			if(location==level){
				location=0;
			}
			while(location>0){
				number/=10;
				location--;
			}
			
			return number%10;
		}
	}

}
