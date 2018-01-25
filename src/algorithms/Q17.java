package algorithms;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;

public class Q17 {
	static List<String> res = new ArrayList<String>();
	static char[] array2 = {'a','b','c'};
	static char[] array3 = {'d','e','f'};
	static char[] array4 = {'g','h','i'};
	static char[] array5 = {'j','k','l'};
	static char[] array6 = {'m','n','o'};
	static char[] array7 = {'p','q','r','s'};
	static char[] array8 = {'t','u','v'};
	static char[] array9 = {'w','x','y','z'};

	public static void main(String[] args) {

		List<String> out = letterCombinations("230");
		
		System.out.println(" ");
		
	}

	
	public static List<String> letterCombinations(String digits) {
        if(digits.length()==0){
        	return res;
        }
        for(int i=0;i<digits.length();i++){
        	if(digits.charAt(i)<'2' || digits.charAt(i)>'9'){
        		return res;
        	}
        }
//        StringBuffer sb = new StringBuffer();
        addDigits("", digits);
        return res;

    }
	
	private static void addDigits(String tmp,String digits){
		if(digits.length()==0){
			res.add(tmp);
			return;
		}
		char digit = digits.charAt(0);
	
		char[] array = null;
		
		switch (digit) {
		case '2':array = array2;break;
		case '3':array = array3;break;
		case '4':array = array4;break;
		case '5':array = array5;break;
		case '6':array = array6;break;
		case '7':array = array7;break;
		case '8':array = array8;break;
		case '9':array = array9;break;

		default:
			break;
		}
		
		for(int j=0;j<array.length;j++){
			addDigits(tmp+array[j], digits.substring(1));
		}
	}
}
