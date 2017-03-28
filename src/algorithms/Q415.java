package algorithms;

public class Q415 {

	public static void main(String[] args) {

		System.out.println(addStrings("123456789","987654321"));
	}
	public static String addStrings(String num1, String num2) {
		String res="";
        int index1 = num1.length()-1;
        int index2 = num2.length()-1;
        
        int add = 0;
        while(index1>=0 && index2>=0){
        	int tmp=num1.charAt(index1)-48 
        			+num2.charAt(index2)-48+add;
        	
        	add=0;
        	index1--;
        	index2--;
        	if(tmp>=10){
        		tmp=tmp-10;
        		add=1;
        	}
        	res=tmp+res;
        }
        

        while(index1>=0){
        	int tmp = num1.charAt(index1)-48+add;
        	add=0;
        	index1--;
        	if(tmp>=10){
        		tmp=tmp-10;
        		add=1;
        	}
        	res=tmp+res;
        }
        
        while(index2>=0){
        	int tmp = num2.charAt(index2)-48+add;
        	add=0;
        	index2--;
        	if(tmp>=10){
        		tmp=tmp-10;
        		add=1;
        	}
        	res=tmp+res;
        }
        
        if(add==1){
        	res=add+res;
        }
        
        return res;
        
    }
}
