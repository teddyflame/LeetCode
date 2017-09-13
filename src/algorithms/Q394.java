package algorithms;

import java.util.Stack;

public class Q394 {

	public static void main(String[] args) {

	}
	public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
        	char tmp = s.charAt(i);
        	if(tmp!=']'){
        		stack.push(tmp);
        	}else{
        		boolean flag = false;
        		StringBuilder sbNow  =new StringBuilder();
        		while(stack.isEmpty() || 
        				(flag && (stack.peek()>'9' ||stack.peek()<'0' ))){
        			if(!flag && stack.peek()!='['){
        				sbNow.append(stack.pop());
        			}else if(stack.peek()=='['){
        				flag = true;
        				
        			}else if(flag){
        				
        			}
        		}
        	}
        }
        
    }
	

}
