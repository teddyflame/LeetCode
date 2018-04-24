package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q797 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int[][] graph = {{1,2}, {3}, {3}, {}};
		
		List<List<Integer>> resultList = allPathsSourceTarget(graph);
		
		System.out.println("");
	}
	
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	    
	    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	        int[] des = graph[0];        
	        for(int i=0;i<des.length;i++){
	            List<List<Integer>> pathLists = new ArrayList<List<Integer>>();
	            List<Integer> pathList = new ArrayList<>();
	            pathList.add(des[i]);
	            pathLists.add(pathList);
	            searchPath(graph,1,pathLists);
	        }        
	        return res;
	    }
	    
	    private  static void searchPath(int[][] graph,int pos,List<List<Integer>> pathLists){
	        if(pos==graph.length-1){
	            res.addAll(pathLists);
	            return;
	        }
	        int[] des = graph[pos];
	        
	        
	        for(int i=0;i<pathLists.size();i++){
	            for(int j=0;j<des.length;j++){
	                pathLists.get(i).add(des[j]);
	            }
	        }
	    }

}
