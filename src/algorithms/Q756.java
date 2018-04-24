package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q756 {

	public static void main(String[] args) {
		
		String bottom = "AFBBAFB";
//		String[] arrayStrings = {"CBB","ACB","ABD","CDB","BDC","CBC","DBA",
//				"DBB","CAB","BCB","BCC","BAA","CCD","BDD","DDD","CCA","CAA","CCC","CCB"};

//		String[] arrayStrings = {"ACC","ACA","AAB","BCA","BCB","BAC","BAA","CAC","BDA","CAA",
//				"CCA","CCC","CCB","DAD","CCD","DAB","ACD","DCA","CAD","CBB","ABB","ABC","ABD",
//				"BDB","BBC","BBA","DDA","CDD","CBC","CBA","CDA","DBA","ABA"};
		
		//"AFBBAFB"
		String[] abdStrings= {"BGD","AGF","AGA","EGC","CCF","EGG","EGF","EGE","DCB","DCA","FGE","FGF",
				"FGA","BFB","BFA","CDA","FFF","FFC","GBE","GBB","BEF","BED","AED","DEA","EEG",
				"EEA","DEF","CEE","GEC","GEA","CCC","BDE","GCD","DGC","AFF","AFA","AFB","DDB",
				"DDA","DDE","CBD","ECG","ECF","DGG","CGC","CGF","GGA","FCE","FCF","FEE","FEB",
				"BBG","BBE","BBC","BBB","ADF","ADE","ADB","DFE","DFC","CDF","CDG","EDF","EDG",
				"EDD","FBA","GDC","FBE","BAF","BAD","BAB","BAC","CAC","CAG","DAD","DAE","EAA",
				"EAF","GAD","FAE","ABA","ABE","ABF","EBB","EBC","GFC"};
		
		
		//String[] abdStrings = {"BDD","ACA","CBA","BDC","AAC","DCB","ABC","DDA","CCB"};
		List<String> alloed = Arrays.asList(abdStrings);
				
		System.out.println(pyramidTransition(bottom, alloed));
	}
	
	public static boolean pyramidTransition(String bottom, List<String> allowed) {
        HashMap<String,List<Character>> map = new HashMap<>();
        
        for(String allow:allowed){
            String base = allow.substring(0,2);
            Character top = allow.charAt(2);
            
            if(map.containsKey(base)){
                List tmpList = map.get(base);
                tmpList.add(top);
                map.put(base,tmpList);
            }else{
                List tmpList = new ArrayList<>();
                tmpList.add(top);
                map.put(base,tmpList);
            }
        }
        
        return checkPyramid(bottom,map,0,new StringBuilder());
    }
    
    public static boolean checkPyramid(String bottom,HashMap<String,List<Character>> map ,
                               int index,StringBuilder newBottom){
        if(bottom.length()==1)return true;
        String baseTwo = Character.toString(bottom.charAt(index)) + bottom.charAt(index+1);
        List<Character> list = map.get(baseTwo);
        for(char top:list){
            newBottom.append(top);
            if(index==bottom.length()-2){
            	boolean flag = true;
                for(int i=0;i<newBottom.length()-1;i++){
                	if(!map.containsKey(newBottom.substring(i,i+2))){
                		flag = false;
                		break;
                	}
                }
                if(flag){
                	//bottom = newBottom.toString();
                	if(checkPyramid(newBottom.toString(),map,0,new StringBuilder()))return true;
                }                
            }else{
                if(checkPyramid(bottom,map,index+1,newBottom))return true; 
            }
            
            newBottom.delete(newBottom.length()-1,newBottom.length());
        }
        
        return false;
    }

}
