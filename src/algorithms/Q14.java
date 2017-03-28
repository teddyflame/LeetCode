package algorithms;

public class Q14 {
	
	public static void main(String[] args) {
		
		String[] inString={"ca","a"}; 
//		["ca","a"]
//				"abbb","a","accc","aa"
		
		System.out.println(longestCommonPrefix(inString));

	}
	
	 public static String longestCommonPrefix(String[] strs) {
		 if(strs.length==0){
	        	return "";
	        }
	        
	        String tmpString=strs[0];
	        int index=0;
	        for(int i=0;i<strs.length;i++){
	            if(strs[i].length()==0){
	                return "";
	            }else if(strs[i].length()<strs[index].length()){
	                tmpString=strs[i];
	                index = i;
	            }
	        }
	        
	        
	        for(int i=0;i<strs.length;i++){
	        	StringBuffer sb = new StringBuffer();
	        	for(int j=0;j<tmpString.length();j++){

	        		if(tmpString.charAt(j)==strs[i].charAt(j)){
	        			sb.append(tmpString.charAt(j));
	        		}else{
	        			tmpString = sb.toString();
	        		}
	        	}
	        }
			
	        
	        return tmpString;
	 }


}
