package algorithms;

//¾ØÕóÐý×ª90¶È£¨Ë³Ê±Õë£©
public class Q48 {

	public static void main(String[] args) {
		int[][] in = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(in);
		
		System.out.println("");

	}
	
	public static void rotate(int[][] matrix) {
        int n=matrix.length;      
        int round=0;
        while(n>1){
        	int startPos = round;
        	int scale = n-1;
        	int endPos = startPos + scale;
        	while(startPos<endPos){
        		move(matrix,round,startPos,scale);
        		startPos++;
        	}
        	round++;
        	n-=2;
        }
    }
	
	private static void move(int[][] matrix,int round,int startPos,int scale){
		int endPos = round + scale;

		//A-->B-->C-->D-->A
		
		//A-->B
		int tmp1 = matrix[startPos][endPos]; //B-->tmp1
		matrix[startPos][endPos] = matrix[round][startPos];	//A-->B
		
		int tmp2 = matrix[endPos][round+endPos-startPos]; //C-->tmp2
		matrix[endPos][round+endPos-startPos] = tmp1;		//tmp1(B)-->C
		
		tmp1 = matrix[round+endPos-startPos][round];	//D-->tmp1;
		matrix[round+endPos-startPos][round] = tmp2;	//tmp2(C)-->D
		
		matrix[round][startPos] = tmp1;					//tmp1(D)-->A
	}

}
