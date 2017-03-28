package algorithms;

public class Q495 {

	public static void main(String[] args) {
		int[] in={1,2};
		
		System.out.println(findPoisonedDuration(in, 2));

	}

	
	public static int findPoisonedDuration
		(int[] timeSeries, int duration) {
		int sum=0;
		
		for(int i=0;i<timeSeries.length;i++){
			if(i<timeSeries.length-1&&
					timeSeries[i+1]<=timeSeries[i]+duration-1){
				sum= sum+timeSeries[i+1]-
						timeSeries[i];
			}else{
				sum+=duration;
			}
		}
		
		return sum;
	}
}
