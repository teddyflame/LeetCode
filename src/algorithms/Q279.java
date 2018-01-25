package algorithms;

public class Q279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numSquares(12));
	}
	
	public static int numSquares(int n) {
        int root = (int)Math.sqrt(n);
        
        int remain = n-root*root;
        
        int count = 1;
        
        while(remain!=0){
            if(remain<4){
                count+=remain;
                break;
            }
            
            root = (int)Math.sqrt(remain);
            remain = remain - root*root;
            count++;
        }
        
        return count;
    }

}
