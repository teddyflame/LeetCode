package algorithms;

public class Q387 {

	public static void main(String[] args) {

		String string="aadadaad";
			System.out.println(firstUniqChar(string));
				
	}
	
    public static  int firstUniqChar(String s) {
  
    	char[] sArray = s.toCharArray();
        for(int i=0;i<sArray.length;i++){
            char tmp = sArray[i];
            if(tmp=='*'){
                continue;
            }
            boolean flag = false;
            for(int j=i+1;j<sArray.length;j++){
            	if(sArray[j]==sArray[i]){
            		sArray[j]='*';
            		flag = true;
            	}
            }
            
            if(!flag){
            	return i;
            }
        }
        
        return -1;
    }

}
