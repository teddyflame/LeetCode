package algorithms;

public class Q345 {

	public static void main(String[] args) {

		String string="aA";
		System.out.println(reverseVowels(string));
	}
	
	public static String reverseVowels(String s) {
        int index1=0;
        int index2=s.length()-1;
        char[] array = s.toCharArray();
        
        while(index1<index2){
        	while(true){
        		if(index1<index2 && !isVowel(s.charAt(index1))){
        			index1++;
        		}else{
        			break;
        		}
        	}
        	
        	while(true){
        		if(index1<index2 && !isVowel(s.charAt(index2))){
        			index2--;
        		}else{
        			break;
        		}
        	}

        	char tmp = array[index1];
        	array[index1] = array[index2];
        	array[index2] = tmp;
        	
        	index1++;
        	index2--;
        }
        return String.valueOf(array);
    }
	
	private static boolean isVowel(char in){
		char tran = Character.toLowerCase(in);
		if(tran=='a' || tran=='e' || tran=='i' || tran=='o' ||tran=='u'){
			return true;
		}else{
			return false;
		}
	}

}
