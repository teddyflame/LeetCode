package tools;

import java.util.List;

public class PublicTools {

	
	public static void PrintIntArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void PrintIntList(List<Integer> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
