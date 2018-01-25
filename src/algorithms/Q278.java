package algorithms;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Q278 {
	
	private static int n=100;
	private static int bad_start = (int)(Math.random()*n);
	
	

	public static void main(String[] args) {
		
		if(bad_start<=1){
			bad_start++;
		}
		
		//bad_start=50;
		System.out.println(bad_start);
		
		System.out.println(firstBadVersion(100));
	}

	public static int firstBadVersion(int n) {
		int min=1;
		int max=n;
		int last_target = 0;
		boolean last_isBad = true;

		while(true){
			long tmp = (long)min + (long)max;
			int target = (int)(tmp/2);
			if(max-min==1){
				return min;
			}
			boolean isBad = isBadVersion(target);
			if (Math.abs(last_target-target)==1 && isBad != last_isBad){
				return Math.min(target, last_target);
			}
			
			if(isBad==true){
				max = target;
			}else{
				min = target;
			}
			
			last_target = target;
			last_isBad = isBad;	
		}
		
		
	}
	
	private static boolean isBadVersion(int version){
		if(version<bad_start){
			return false;
		}else{
			return true;
		}
	}
	
	
}
