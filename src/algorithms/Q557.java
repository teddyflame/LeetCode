package algorithms;

public class Q557 {

	public static void main(String[] args) {	
		String string="Let's take LeetCode contest";
		System.out.println(reverseWords(string));
	}
	
	public static String reverseWords(String s) {
		if(s.length()<=1){
			return s;
		}
		
		StringBuilder sb = new StringBuilder();
        String[] tmp = s.split(" ");
        for(int i=0;i<tmp.length;i++){
        	sb.append(reverse(tmp[i]));
        	sb.append(" ");
        }   
        return sb.toString().trim();   
    }

	private static StringBuilder reverse(String word){
		StringBuilder builder = new StringBuilder();		
		for(int i=word.length()-1;i>=0;i--){
			builder.append(word.charAt(i));
		}
			return builder;
	}
}
