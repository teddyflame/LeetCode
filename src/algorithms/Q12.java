package algorithms;

public class Q12 {

	public static void main(String[] args) {

	}
	
	public static  String intToRoman(int num) {
        
		StringBuilder sb = new StringBuilder();
		
		int qian = num/1000;
		for(int i=0;i<qian;i++){
			sb.append('M');
		}
		
		num-=qian*1000;
		
		int bai=num/100;
		
		switch(bai){
		case 1:sb.append('C');break;
		case 2:sb.append("CC");break;
		case 3:sb.append("CCC");break;
		case 4:sb.append("CD");break;
		case 5:sb.append("D");break;
		case 6:sb.append("DC");break;
		case 7:sb.append("DCC");break;
		case 8:sb.append("DCCC");break;
		case 9:sb.append("CM");break;
		}
		
		num-=bai*100;
		
		int shi = num/10;
		switch(shi){
		case 1:sb.append('X');break;
		case 2:sb.append("XX");break;
		case 3:sb.append("XXX");break;
		case 4:sb.append("XL");break;
		case 5:sb.append("L");break;
		case 6:sb.append("LX");break;
		case 7:sb.append("LXX");break;
		case 8:sb.append("LXXX");break;
		case 9:sb.append("XC");break;
		}
		
		int ge = num-shi*10;
		switch(ge){
		case 1:sb.append('I');break;
		case 2:sb.append("II");break;
		case 3:sb.append("III");break;
		case 4:sb.append("IV");break;
		case 5:sb.append("V");break;
		case 6:sb.append("VI");break;
		case 7:sb.append("VII");break;
		case 8:sb.append("VIII");break;
		case 9:sb.append("IX");break;
		}
		
		return sb.toString();
    }

}
