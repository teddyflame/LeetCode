package algorithms;

public class Q69 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(mySqrt(4));
	}
	
	public static int mySqrt(int x) {
        
        if(x<0){
            return -1;
        }else if(x==0){
            return 0;
        }
        
        
        double x0 = 1.0;
        while(Math.abs(x0*x0 - x)>1e-9){
            x0 = (x0*x0+x)/(2*x0);
        }
        
        return (int)Math.round(x0);
        
    }

}
