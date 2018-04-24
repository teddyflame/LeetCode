package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q609 {

	public static void main(String[] args) {

		String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
		
		findDuplicate(paths);
	}
	
	public static List<List<String>> findDuplicate(String[] paths) {
		
		List<List<String>> res = new ArrayList<List<String>>();
		
		for(int i=0;i<paths.length;i++){
			String content = paths[i];
			
			String[] files = content.split(" ");
			
			String path = files[0];
			
			
			
			
			System.out.println("'");
		}
		
		return res;
        
    }
	

		
	
}
