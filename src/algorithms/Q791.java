package algorithms;

import java.util.LinkedList;
import java.util.List;

public class Q791 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String S = "exv";
		String T = "xwvee";
		
		System.out.println(customSortString(S, T));
	}
	
	public static String customSortString(String S, String T) {
        List<Character> list = new LinkedList<>();
        
        list.add(T.charAt(0));
        
        for(int i=1;i<T.length();i++){
        	boolean flag = false;
            for(int j=0;j<list.size();j++){
                if(judge(T.charAt(i),list.get(j),S)){
                    list.add(j,T.charAt(i));
                    flag = true;
                    break;
                }
            }
            
            if(!flag)list.add(T.charAt(i));
        }
        
        StringBuilder sb =new StringBuilder();
        for(char x:list){
            sb.append(x);
        }
        return sb.toString();
            
    }
    
    private static boolean judge(char a,char b,String S){
        if(S.indexOf(a)<=S.indexOf(b))return true;
        
        return false;
    }

}
