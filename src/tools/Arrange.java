package tools;

import java.util.ArrayList;
import java.util.List;

public class Arrange {

	 public static void main(String[] args) {  
	        Arrange arrange = new Arrange();  
	        List<Character> data = new ArrayList<Character>();  
	        data.add('a');  
	        data.add('b');  
	        data.add('c');  
	        data.add('d');  
	          
	        //���A(n,n)��ȫ����  

	        arrange.arrangeSelect(data,new ArrayList<Character>(),data.size());  
	  
	    }  
	      
	    /** 
	     * ����A(n,k) 
	     *  
	     * @param data 
	     * @param target 
	     * @param k 
	     */  
	    public <E> void arrangeSelect(List<E> data,List<E> target, int k) {  
	        List<E> copyData;  
	        List<E> copyTarget;  
	        if(target.size() == k) {  
	            for(E i : target)   
	                System.out.print(i);  
	            System.out.println();  
	        }  
	      
	        for(int i=0; i<data.size(); i++) {  
	            copyData = new ArrayList<E>(data);  
	            copyTarget = new ArrayList<E>(target);  
	              
	            copyTarget.add(copyData.get(i));  
	            copyData.remove(i);  
	              
	            arrangeSelect(copyData, copyTarget,k);  
	        }  
	    }  
	  

}
