package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q672 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(flipLights(5,1000));
	}

	public static int flipLights(int n, int m) {
		if(m==0)return 1;
		if(n==1)return 2;
		if(n==2&&m==1)return 3;
		if(n==2)return 4;
		if(m==1)return 4;
		if(m==2)return 7;
		return 8;
    }
	


}
