package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q649 {

	public static void main(String[] args) {
		String in = "DRRDRD";
		System.out.println(predictPartyVictory(in));
	}
	
	public static String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> qR = new LinkedList<>();
        Queue<Integer> qD = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                qR.add(i);
            }else{
                qD.add(i);
            }
        }
        
        while(!qR.isEmpty() && !qD.isEmpty()){
            int indexR = qR.poll();
            int indexD = qD.poll();
            
            if(indexR<indexD){
                qR.add(indexR+n);
            }else{
                qD.add(indexD+n);
            }
        }
        
        if(qR.isEmpty()){
            return "Dire";
        }
        return "Radiant";        
    }

}
