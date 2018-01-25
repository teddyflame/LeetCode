package algorithms;

public class Q592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expression ="-5/2+10/3+7/9";
		System.out.println(fractionAddition(expression));
	}
	
	public static String fractionAddition(String expression) {
        int startIndex = 0;
        int endIndex = 3;
        int[] sum = new int[2];
        while(endIndex<expression.length()){
            if(expression.charAt(endIndex)=='+' ||expression.charAt(endIndex)=='-' ){
                addFraction(sum,expression.substring(startIndex,endIndex));
               startIndex = endIndex;
            }
            endIndex++;
        }
        
        addFraction(sum, expression.substring(startIndex,expression.length()));

        return  yuefen(sum);
    }
    
    private static void addFraction(int[] sum,String fraction){
        int[] tmp = new int[2];
        int index = 0;
        for(int i = 0;i<fraction.length();i++){
        	if(fraction.charAt(i)=='/'){
        		index = i;
        		break;
        	}
        }
        
        tmp[0] = Integer.parseInt(fraction.substring(0,index));
        tmp[1] = Integer.parseInt(fraction.substring(index+1,fraction.length()));
        
        if(tmp[0]==0)return;
        
        if(sum[0]==0){
            sum[0] = tmp[0];
            sum[1] = tmp[1];
            return;
        }
        
        sum[0]  = sum[0] * tmp[1] + tmp[0] * sum[1];
        
        sum[1]*=tmp[1];
    }
    
    private static String yuefen(int[] sum){
    	if(sum[0]==0)return "0/1";
        StringBuilder sb = new StringBuilder();
        int factor = 1;
        
        int x = Math.max(sum[0],sum[1]);
        int y = Math.min(sum[0],sum[1]);
        
        
        while(true){
            int tmp = x%y;
            if(tmp==0){
                factor = Math.abs(y);
                break;
            }
            x = y;
            y = tmp;

        }
        
        sb.append(sum[0]/factor);
        sb.append('/');
        sb.append(sum[1]/factor);
        
        return sb.toString();
    }

}
