package algorithms;

public class Q434 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" Hello, my name is John";

		System.out.println(countSegments(s));
	}
	
	public static int countSegments(String s) {
		int count=0;
		boolean flag = true;	//上一个是空格
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)==' '){
        		if(!flag){
        			count++;
        			flag = true;
        		}
        	}else{
        		flag = false;
        	}
        }
        
        if(!flag)count++;
        return count;
    }

}
