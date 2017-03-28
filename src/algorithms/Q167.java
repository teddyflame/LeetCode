package algorithms;

public class Q167 {

	public static void main(String[] args) {

		int[] input = {2,7,11,15};
		
		int[] out=twoSum(input, 18);
		
		System.out.println(out[0]);
		System.out.println(out[1]);
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int[] a = {0,0};
		
		for(int i=0;i<numbers.length;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i]+numbers[j]==target){
					a[0]=i+1;
					a[1]=j+1;
					return a;
				}else if(numbers[i]+numbers[j]>target){
					break;
				}
			}
		}
		return a;
    }

}
