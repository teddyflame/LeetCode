package algorithms;

public class Q204 {

	public static void main(String[] args) {

		
		System.out.println(countPrimes(499979));
	}
	
	
	public static int countPrimes(int n) {

		int count=0;
        int[] primes = new int[n/2];
        int index=0;

        for(int i=2;i<n;i++){
            boolean flag = true;
            for(int j=0;j<index;j++){
                if(i%primes[j]==0){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                primes[index++] = i;
                count++;
            }
        }
        
        return count;
    }

}
