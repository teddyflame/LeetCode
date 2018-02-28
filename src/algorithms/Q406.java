package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Q406 {

	public static void main(String[] args) {

		int[][] people = {{7,0}, {4,4}, {7,1}, 
		                  {5,0}, {6,1}, {5,2}};
		
		int[][] out = reconstructQueue(people);
		
		System.out.println("");
	}
	
	public static int[][] reconstructQueue(int[][] people) {
        List<int[]> list = new LinkedList<>();
        int[][] res = new int[people.length][2];
        Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]){
					return o1[1]-o2[1];
				}else{
					return o2[0]-o1[0];
				}
			}

		});
        
        for(int i=0;i<people.length;i++){
            list.add(people[i][1],people[i]);
        }

        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);    
        }
    
        return res;
    }
	

}
