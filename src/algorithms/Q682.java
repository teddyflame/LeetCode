package algorithms;

import java.util.ArrayList;

public class Q682 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String[] inString = {"5","2","C","D","+"};
		
		System.out.println(calPoints(inString));
	}
	
	 public static int calPoints(String[] ops) {
	        int res = 0;
	        ArrayList<Integer> list = new ArrayList<>();
	       // int count = 0;
	        
	        for(int i=0;i<ops.length;i++){
	            String tmp = ops[i];
	            
	            if(tmp.equals("C")){              
	                int score = list.get(list.size()-1);
	                list.remove(list.size()-1);            
	                res-=score;
	            }else if(tmp.equals("D")){
	                int score = list.get(list.size()-1);
	                score *=2;                
	                list.add(score);
	                res +=score;
	                
	            }else if(tmp.equals("+")){
	                int score = list.get(list.size()-1) + list.get(list.size()-2);
	                list.add(score);
	                res +=score;
	            }else{
	                int score = Integer.parseInt(tmp);
	                list.add(score);
	                res += score;
	            }
	        }
	        
	        return res;
	    }

}
