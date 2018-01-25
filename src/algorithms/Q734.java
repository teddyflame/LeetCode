package algorithms;

import java.util.HashMap;

public class Q734 {

	public static void main(String[] args) {
		
		String[] words1 = {"this","summer","thomas","get","actually","actually","rich",
				"and","possess","the","actually","great","and","fine","vehicle","every",
				"morning","he","drives","one","nice","car","around","one","great","city",
				"to","have","single","super","excellent","super","as","his","brunch",
				"but","he","only","eat","single","few","fine","food","as","some","fruits",
				"he","wants","to","eat","an","unique","and","actually","healthy","life"};
		
		String[] words2 = {"this","summer","thomas","get","very","very","rich",
				"and","possess","the","very","fine","and","well","car","every",
				"morning","he","drives","a","fine","car","around","unique","great","city",
				"to","take","any","really","wonderful","fruits","as","his","breakfast",
				"but","he","only","drink","an","few","excellent","breakfast","as","a","super",
				"he","wants","to","drink","the","some","and","extremely","healthy","life"};
		
		String[][] pairs = {{"very","actually"},};
				
				

		System.out.println(areSentencesSimilar(words1, words2, pairs));
		
	}
	
	public static boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if(words1.length!=words2.length)return false;
        
        HashMap<String,String> map1 = new HashMap<>();
        for(int i=0;i<pairs.length;i++){
            map1.put(pairs[i][0],pairs[i][1]);
        }
        
        for(int i=0;i<words1.length;i++){
         //   boolean matchFlag = false;
            if(words1[i].equals(words2[i])){
                continue;
            }
            
            if(map1.containsKey(words1[i]) && map1.get(words1[i]).equals(words2[i]))
                continue;
            if(map1.containsKey(words2[i]) && map1.get(words2[i]).equals(words1[i]))
                continue;
            
            return false;
        }
        
        return true;
    }

}
