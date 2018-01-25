package algorithms;

public class Q507 {

	public static void main(String[] args) {

		System.out.println(checkPerfectNumber(99999997));
	}
	
public static boolean checkPerfectNumber(int num) {
        
        if(num<=0)return false;
        
        int sum = num-1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                sum-=i;
            }
        }
        
        if(sum==0){
            return true;
        }else{
            return false;
        }
    }

}
