package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sun.security.action.PutAllAction;

public class Q406 {

	public static void main(String[] args) {

		int[][] people = {{7,0}, {4,4}, {7,1}, 
		                  {5,0}, {6,1}, {5,2}};
		
		int[][] out = reconstructQueue(people);
		
		System.out.println("");
	}
	
	public static int[][] reconstructQueue(int[][] people) {
		int n = people.length;
	    int[][] copy = new int[n][];
	    int[][] res = new int[n][];
	        
	    for (int i = 0; i < n; i++) copy[i] = Arrays.copyOf(people[i], 2);
	    
	    for (int i = 0; i < n; i++) {
	        int k = -1;
	         
	        // pick the front element
	        for (int j = 0; j < n; j++) {
	            if (copy[j][1] == 0 && (k == -1 || copy[j][0] < copy[k][0])) k = j;
	        }
	            
	        res[i] = people[k];   // set the result
	        
	        // modify the k values of those with smaller or equal h values
	        for (int j = 0; j < n; j++) {
	            if (copy[j][0] <= copy[k][0]) copy[j][1]--;
	        }
	    }
	        
	    return res;
    }
	

}
