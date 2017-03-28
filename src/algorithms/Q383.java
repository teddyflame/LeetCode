package algorithms;

import java.util.Arrays;


public class Q383 {

	public static void main(String[] args) {

		
//		String aString="bg";
//		String bString = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
		
		String aString="aa";
		String bString="ab";
		System.out.println(canConstruct(aString, bString));
	}
	
public static boolean canConstruct
	(String ransomNote, String magazine) {
	
	if(magazine.length()<ransomNote.length())return false;
	char[] mag = magazine.toCharArray();
	char[] target = ransomNote.toCharArray();
	
		for(int i=0;i<target.length;i++){
			char tmp = target[i];
			boolean flag=false;
			for(int j=0;j<mag.length;j++){
				if(mag[j]==tmp){
					mag[j]='*';
					flag=true;
					break;
				}
				
				
				
			}
			if(!flag){
				return false;
			}
		}
		return true;
    }

}
