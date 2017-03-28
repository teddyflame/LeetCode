package algorithms;

public class Q344 {

	public static void main(String[] args) {
		String string = "hello";
		
		System.out.println(reverseString(string));

	}
	
	public static String reverseString(String s) {
        StringBuffer sBuffer =new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			sBuffer.append(s.charAt(i));
		}
		
		return sBuffer.toString();
    }

}
