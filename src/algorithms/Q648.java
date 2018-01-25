package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.ListModel;

public class Q648 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] dict = {"cat", "bat", "rat"};
		List<String> dict  = new ArrayList<String>();
		dict.add("cat");
		dict.add("bat");
		dict.add("rat");
		
		String sentence = "the cattle was rattled by the battery";
		System.out.println(replaceWords(dict, sentence));
	}
	
	public static String replaceWords(List<String> dict, String sentence) {
        
	
		Collections.sort(dict, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
			
		});
		
		String[] source = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String string : source) {
			boolean flag = false;
			for (String root : dict) {
				if(string.length()<root.length()){
					break;
				}else{
					if(string.substring(0,root.length()).equals(root)){
						sb.append(root + " ");
						flag = true;
						break;
					}
				}

			}
			
			if(!flag){
				sb.append(string+" ");
			}
		}
		
		return sb.toString().trim();
    }

}
