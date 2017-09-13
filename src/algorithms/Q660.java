package algorithms;

public class Q660 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(newInteger(800000000));
	}
	
	public static int newInteger(int n) {
        if(n<9)return n;
        
        long count9 = 1;
        long i = 10;
        long last_available = 0;
        long available = 0;
        while(true){
        	last_available = available;
        	available = i-count9;
            if(n<available){
            //	int level = (int)i/10;
                return (int)(i/10)+newInteger((int)(n-last_available));
            }
            count9 = count9*9+i;
            i*=10;
        }
    }

}
