package algorithms;


public class Q413 {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		System.out.println(numberOfArithmeticSlices(a));
	}
	
	public static int numberOfArithmeticSlices(int[] A) {
       int count=0;
		for(int i=0;i<A.length-2;i++){
        	int cha = A[i+1] - A[i];
        	if(cha==A[i+2] - A[i+1]){
        		count++;
        		int index=i+2;
        		while(index<A.length-1){
        			if(A[index+1]-A[index]==cha){
        				count++;
        				index++;
        			}else{
        				break;
        			}
        		}
        	}
        }
		
		return count;
    }

}
