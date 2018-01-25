package algorithms;

public class Q583 {

	public static void main(String[] args) { 

		System.out.println(minDistance("intention", "execution"));
	}
	
	 public static int minDistance(String word1, String word2) {
		 int nextIndex = 0;
		 int res = word1.length()+word2.length();
		 
		 while(nextIndex>=0){

			 String target = word2;
			 int index = nextIndex;
			 int count = index;
			 boolean flag = false;
			 while(index<word1.length()){ 
				 int pos = target.indexOf(
					 Character.toString(word1.charAt(index)));
			 
				 if(pos==-1){
					 count++; 
				 }else{
					 if(!flag){
						 flag = true;
						 nextIndex = nextIndex==index?index+1:index;
					 }
					 count+=pos;
					 target = target.substring(pos+1);
				 }
				 index++;
			 }
			 
			 count+=target.length();
			 
			 if(count<res){
				 res = count;
			 }
			 
			 if(!flag){
				 nextIndex = -1;
			 }
		 }
		 
		 return res;
	 }

}
