package algorithms;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Q744 {

	public static void main(String[] args) {
		
		
		char[] in = {'c','f','j'};
		
		System.out.println(nextGreatestLetter(in, 'g'));
		

	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
		 if(target>=letters[letters.length-1])return letters[0];
	        
	        int start = 0;
	        int end = letters.length-1;
	        int mid = (end-start)/2;
	        
	        int oldStart = 0;
	        int oldEnd = end;
	        
	        while(start<end){
	            
	            
	            if(target>letters[mid]){
	                oldStart = start;                
	                start = mid;
	                oldEnd = end;
	            }else if(target<letters[mid]){
	                oldEnd = end;
	                end = mid;
	                oldStart = start;
	            }else{
	                break;
	            }
	            if(oldStart == start && oldEnd == end)break;
	            mid = (end-start)/2 + start;
	        }
	        
	        for(int i=mid;i<=end;i++){
	            if(target<letters[i])
	                return letters[i];            
	        }
	        
	        return letters[0];
		
		
	}

}
