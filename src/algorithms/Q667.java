package algorithms;


public class Q667 {

	public static void main(String[] args) {
		int[] out = constructArray(5, 4);
		
		System.out.println("");
	}
	
	public static int[] constructArray(int n, int k) {
        int[] out = new int[n];
        int i=1,j=n;
        for(int index=0;i<=j;index++) {
        	out[index] = k>1? (k--%2!=0? i++ : j--) : i++;
        }
	
		return out;
    }

}
