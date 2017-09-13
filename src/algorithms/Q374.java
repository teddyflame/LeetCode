package algorithms;

public class Q374 {
	
	private final static int a = 1702766719;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(guessNumber(2126753390));
	}
	
	public static int guessNumber(int n) {
        if(n==1)return 1;
        
        int min = 1;
        int max = n;
        
        while(true){
        	long tmp = (long)min+(long)max;
        	int target = (int)(tmp/2);
            if(guess(target)==0){
                return target;
            }else if(guess(target)==-1){ //lower
                if(max==target){
                    return target-1;
                }else{
                    max = target;
                }
            }else{                      //higher
                if(min==target){
                    return target+1;
                }else{
                    min = target;
                }
            }
        }
    }
	
	private static int guess(int in){
		if(in==a){
			return 0;
		}else if(in<a){
			return 1;
		}else{
			return -1;
		}
	}

}
