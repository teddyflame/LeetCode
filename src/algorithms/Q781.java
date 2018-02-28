package algorithms;

import java.util.Arrays;

public class Q781 {

	public static void main(String[] args) {
		int[] in = {1,2,2,2,2,3};
		
		System.out.println(numRabbits(in));
		

	}
	
public static int numRabbits(int[] answers) {
        
        if(answers==null || answers.length==0)return 0;
        
        if(answers.length==1)return answers[0]+1;
        
        int sum=0;
        
        Arrays.sort(answers);
        
        int startIndex = 0;
        int index = 1;
        
        while(index<answers.length){
            if(answers[index]!=answers[startIndex]){
                sum+=calculate(answers[startIndex],index-startIndex);
                startIndex = index;
            }
            index++;
        }
        
        sum+=calculate(answers[startIndex],answers.length-startIndex);
        
        return sum;
    }
    
    private static int calculate(int x,int num){
    	int tmp = num/(x+1);
        if(num<=(x+1)){
            return x+1;
        }else{
        	
        	if(num%(x+1)!=0)tmp++;
            return tmp*(x+1);
        }
    }

}
