package algorithms;

import java.util.Set;


public class Q59 {
	
	static int i=0,j=0;
    static int mode=0;

	public static void main(String[] args) {

		int[][] result = generateMatrix(3);
		
		System.out.println("");
	}
	public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        for(int a=1;a<=n*n;a++){
        	setNum(a,res,n);
        }
        return res;
    }
	
	private static void setNum(int a,int[][] res,int n){
		switch(mode){
		case 0:
			if(j==n || res[i][j]!=0){
				j--;
				i++;
				mode=1;
				setNum(a,res,n);
			}else{
				res[i][j] = a;
				j++;
			}
			break;
		case 1:
			if(i==n || res[i][j]!=0){
				i--;
				j--;
				mode=2;
				setNum(a,res,n);
			}else{
				res[i][j] = a;
				i++;
			}
			break;
		case 2:
			if(j==-1 || res[i][j]!=0){
				j++;
				i--;
				mode=3;
				setNum(a,res,n);
			}else{
				res[i][j] = a;
				j--;
			}
			break;
		case 3:
			if(i==-1 || res[i][j]!=0){
				i++;
				j++;
				mode=0;
				setNum(a,res,n);
			}else{
				res[i][j] = a;
				i--;
			}
			break;
			
		}
	}

}
