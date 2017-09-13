package algorithms;

public class Q43 {

	public static void main(String[] args) {

	}
	
	public static String multiply(String num1, String num2) {
        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();
        
        String res="";
        for(int i=num1Char.length-1;i>=0;i--){
        	//StringBuilder sb = new StringBuilder();
        	String tmp="";
        	int add = 0;
        	for(int j=num2.length()-1;j>=0;j--){
        		int mult = num1Char[i] * num2Char[j] + add;
        		if(mult>=10){
        			mult%=10;
        			add = mult/10;
        		}else{
        			add = 0;
        		}
        		tmp = mult+ tmp;
        	}
        	
        	res = addString(res,tmp);
        }
        
        return res;
    }
	
	private static String addString(String a,String b){
		StringBuilder result = new StringBuilder();
		
		char[] x = a.toCharArray();
		char[] y = b.toCharArray();
		
		result.append(x[a.length()-1]);
		int index1 = a.length()-2;
		int index2 = b.length()-1;
		while(index1>=0 || index2>=0){
			//if()
		}
		
		return "";
	}

}
