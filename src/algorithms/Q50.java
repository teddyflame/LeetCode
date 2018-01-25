package algorithms;

public class Q50 {

	public static void main(String[] args) {

		System.out.println(myPow(2.00000,
				214748364));
		System.out.println(Double.POSITIVE_INFINITY);
		//System.out.println(myPow(-13.62608, 3));
	}
	
	public static double myPow(double x, int n) {
        if(x==0)return 0;
        if(n==0)return 1;
        double res = x;
        if(n>0){
            for(int i=0;i<n-1;i++){
                res *= x;
                if(Math.abs(res)<1e-9){
                	return 0.0000;
                }else if(res == Double.POSITIVE_INFINITY 
                		|| res ==  Double.NEGATIVE_INFINITY){
                	return res;
                }
            }
        }else{
            int n_plus = 0-n;
            res = 1/x;
            for(int i=0;i<n_plus-1;i++){
                res*=1/x;
                
                if(Math.abs(res)<1e-9){
                	return 0.0000;
                }else if(res == Double.POSITIVE_INFINITY 
                		|| res ==  Double.NEGATIVE_INFINITY){
                	return res;
                }
                
            }
        }
        
        return res;
    }

}
