package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.ListModel;

public class Q554 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		List<List<Integer>> wall = new ArrayList<List<Integer>>();
		
		List<Integer> w1 = new ArrayList<>();
		List<Integer> w2 = new ArrayList<>();
		List<Integer> w3 = new ArrayList<>();
		
		w1.add(1);
		w1.add(1);
		w2.add(2);
		
		wall.add(w1);
		wall.add(w2);
		wall.add(w1);
		
		System.out.println(leastBricks(wall));

	}
	
	 public static int leastBricks(List<List<Integer>> wall) {
	        
	        if(wall==null || wall.size()==0){
	            return 0;
	        }
	        int count = 0;
	        HashMap<Integer,Integer> map = new HashMap<>();
	        
	        for(int i=0;i<wall.size();i++){
	            List<Integer> list = wall.get(i);

	            int length = 0;
	            for(int j=0;j<list.size()-1;j++){
	                length+=list.get(j);
	                map.put(length,map.getOrDefault(length,0)+1);          
	                count = Math.max(count, map.get(length));
	            }
	             
	        }	     
	        return wall.size()-count;
	    }
}
