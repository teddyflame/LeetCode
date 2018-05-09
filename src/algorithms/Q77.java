package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<List<Integer>> outList = combine(4, 2);
		System.out.println("");
	}
	
	private static  List<List<Integer>> res = new ArrayList<List<Integer>>();
    public static  List<List<Integer>> combine(int n, int k) {
        
        int[] source = new int[n];
        
        for(int i=1;i<=n;i++){
            source[i-1]=i;
        }
        
        check(source, new ArrayList<Integer>(),k,0);
        
        return res;
    }
    
    private static void check(int[] source,List<Integer> list,int k,int index){
        if(list.size()==k){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        //List<Integer> tmp = new ArrayList<>(source);
        for(int i=index;i<source.length;i++){
            list.add(source[i]);
           // tmp.remove(i);
            check(source,list,k,i+1);
            list.remove(list.size()-1);
        }
    }

}
