
package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(frequencySort("tree"));
		
	}
	
	public static String frequencySort(String s) {

        if(s==null || s.length()==0){
            return "";
        }
        int[] nums = new int[256];
        List<Integer> list = new ArrayList<>(256);
         
         for(int i=0;i<s.length();i++){
             int index = (int)s.charAt(i);
             
             nums[index]++;
           
         }
         
         for(int i=0;i<256;i++){
             list.add(nums[i]);
         }
        
        List<Integer> sortList = new ArrayList<>(list);
        
        Collections.sort(sortList,new Comparator<Integer>(){
            
            @Override
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sortList.size();i++){
        	int num = sortList.get(i);
            if(num==0)break;
            
            int index = list.indexOf(num);
            for(int j=0;j<num;j++){
                sb.append((char)index);
            }
            list.set(index, 0);
        }
        
        return sb.toString();
    }

}

