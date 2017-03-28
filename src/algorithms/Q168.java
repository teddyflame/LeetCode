package algorithms;

public class Q168 {

	public static void main(String[] args) {

		System.out.println(convertToTitle(703));
	}

	public static String convertToTitle(int n) {
        String result="";
		
        //char a='A';
		if(n<=0){
        	
        }else if(n<=26){
        	return Character.toString((char)('A'+n-1));
        }else{
        	while(n!=0){
        		if(n%26==0){
            		result='Z'+result;
            		n=n/26-1;
            	}else{
            		char x = (char)(n%26-1+'A');
            		result = x+result;
            		n=n/26;
            	}
            	
//            	n=n/26;
        	}
        	
        }
		return result;
    }
}
