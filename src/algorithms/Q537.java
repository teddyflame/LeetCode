package algorithms;

public class Q537 {

	public static void main(String[] args) {

		String aa ="1+1i";
		String bb = "1+1i";
		System.out.println(complexNumberMultiply(aa, bb));
	}
	
	static int realSum = 0;
    static int imagSum = 0;
    public static String complexNumberMultiply(String a, String b) {
        String[] aArray = a.split("\\+");
        String[] bArray = b.split("\\+");
        
        for(int i=0;i<aArray.length;i++){
            for(int j=0;j<bArray.length;j++){
                multiplyNum(aArray[i],bArray[j]);
            }
        }
        
        String res = Integer.toString(realSum) + '+' + Integer.toString(imagSum)+'i';
        return res;
    }
    
    
    private static void multiplyNum(String x,String y){
        int count=0;
        if(x.charAt(x.length()-1)=='i'){
            count++;
            x = x.substring(0,x.length()-1);
        }
        
        if(y.charAt(y.length()-1)=='i'){
            count++;
            y = y.substring(0,y.length()-1);
        }
        
        Integer xNum = new Integer(x);
        Integer yNum = new Integer(y);
        
        int sum = xNum * yNum;
        
        if(count==0){
            realSum+= sum;
        }else if(count==1){
            imagSum+= sum;
        }else{
            realSum-=sum;
        }
    }

}
