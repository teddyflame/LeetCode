package algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.javafx.image.IntToBytePixelConverter;

public class Q190 {

	public static void main(String[] args) {

	//	int a = 2147483648;
		//System.out.println(Integer.parseInt("-0"));
		System.out.println(reverseBits(0xaaaaaaaa));
	}
	
	public static int reverseBits(int n) {
		 int result = 0;
	        for (int i = 0; i < 32; i++) {
	            result += n & 1;
	            n >>>= 1;   // CATCH: must do unsigned shift
	            if (i < 31) // CATCH: for last digit, don't shift!
	            result <<= 1;
	        }
	        return result;
    }

}
