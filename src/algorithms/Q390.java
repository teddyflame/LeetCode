package algorithms;

import java.util.LinkedList;
import java.util.List;

public class Q390 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lastRemaining(3901));
	}

	
	public static int lastRemaining(int n) {
        List<Integer> list = new LinkedList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        
        int mode =1;
        while(list.size()>1){
            if(mode==1){
                mode = 2;
                
                if(list.size()==2){
                	list.remove(0);
                	continue;
                }

                int num = (list.size()+1)/2-1;
                for(int i=0;i<=num;i++){
                    list.remove(i);
                }
            }else{
                mode=1;
                for(int i=list.size()-1;i>=0;i=i-2){
                    list.remove(i);
                }
            }
        }
        
        return list.get(0);
    }
}
