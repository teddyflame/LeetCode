package algorithms;

import java.util.ArrayList;

public class Q66 {

	public static void main(String[] args) {
		
		int in[] = {9};
		

		int out[] = plusOne(in);
		for(int k=0;k<out.length;k++){
			System.out.print(out[k]+" ");
		}
		
	}
	
	
	 public static int[] plusOne(int[] digits) {
	        
		int length=digits.length;
		//int out[] = new int[length+1];
		int jin=0;
		ArrayList<Integer> list=new ArrayList<>(); 
		int res=0;
		 
		 for(int i=length-1;i>=0;i--){
			 if(i==length-1){
				  res=digits[i]+1;
				 if(res<10){
					 jin=0;
					 list.add(res);
				 }else{
					 jin=1;
					 list.add(res%10);
				 }
			 }else{
				 res=digits[i]+jin;
				 if(res<10){
					 jin=0;
					 list.add(res);
				 }else{
					 jin=1;
					 list.add(res%10);
				 }
			 }
		 }
		 
		 if(jin==1){
			 list.add(1);
		 }
		 
		 int out[] = new int[list.size()];
		 int index=0;
		 for(int j=list.size()-1;j>=0;j--){
			 out[index] = list.get(j);
			 index++;
		 }
		 return out;
	 }

}
