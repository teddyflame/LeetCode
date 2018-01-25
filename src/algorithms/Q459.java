package algorithms;

public class Q459 {

	public static void main(String[] args) {

		
		String string =  "abab";
		System.out.println(repeatedSubstringPattern(string));
		
		char a = '7';
		System.out.println(a);
	}
	
	public static boolean repeatedSubstringPattern(String s) {
        char[] array = s.toCharArray();
        
        StringBuffer sb = new StringBuffer();
        char first = array[0];
        
        sb.append(first);
        int index = 1;
        while(index<array.length){
        	if(array[index]!=first){
        		sb.append(array[index]);
        		index++;
        	}else{
        		if(isRepeated(s,sb.toString())){
        			return true;
        		}else{
        			sb.append(array[index]);
        			index++;
        		}
        	}
        }
        
        return false;
    }
	
	private static boolean isRepeated(String s,String sub){
		int length_s = s.length();
		int length_sub = sub.length();
		
		if(length_s%length_sub!=0){
			return false;
		}else{
			int count = length_s/length_sub;
			StringBuilder sb  =new StringBuilder();
			for(int i=0;i<count;i++){
				sb.append(sub);
			}
			
			if(s.equals(sb.toString())){
				return true;
			}else{
				return false;
			}
		}
	}

}
