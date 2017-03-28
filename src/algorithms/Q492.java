package algorithms;

public class Q492 {

	public static void main(String[] args) {
		int[] result=constructRectangle(48);
		
		System.out.println(result[0]);
		
		System.out.println(result[1]);
	}
	
public static int[] constructRectangle(int area) {
        int outL = area;
        int outW = 0;
		for(int x=1;x<=area;x++){
        	if(area%x!=0)continue;
        	
        	int y=area/x;
        	
        	if(y>x)continue;
        	
        	int e=x-y;
        	if(outL-outW>x-y){
        		outL=x;
        		outW=y;
        	}
        }
		
		int[] out={outL,outW};
		return out;
		
    }

}
