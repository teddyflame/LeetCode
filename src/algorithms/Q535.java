package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q535 {

	public static void main(String[] args) {
		
		String in = encode("https://leetcode.com/problems/design-tinyurl");
		//System.out.println(encode("https://leetcode.com/problems/design-tinyurl"));
		System.out.println(in);
		
		String out = decode(in);
		
		System.out.println(out);
	}
	
	static List<String> store = new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        store.add(longUrl);
        
        int num= store.size()-1;
        
        return convert(num);
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        int index = search(shortUrl);
        return store.get(index);
    }
    
    private static String convert(int num){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<6;i++){
            int code = num%62;
            num = num/62;
            
            sb.append(encode(code));
        }
        return sb.toString();
    }
    
    private  static int search(String url){
        int sum = 0;
        
        for(int i=0;i<6;i++){
            sum+= decode(url.charAt(i)) * (int)Math.pow(26,i);
        }
        return sum;
    }
    
    private  static char encode(int code){
        if(code<10){
            return (char) (code+48);
        }else if(code>=10 && code<36){
            return (char)(code+55);
        }else{
            return (char)(code+61);
        }
    }
    
    private  static int decode(char code){
        if(code<='9'){
            return (int)(code-48);
        }else if(code>='A' && code<='Z'){
            return (int)(code-55);
        }else{
            return (int)(code-61);
        }
    }

}
