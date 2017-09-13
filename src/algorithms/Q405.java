package algorithms;

import java.util.Arrays;

public class Q405 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(toHex(-2));
	}
	
	public static String toHex(int num) {
		if(num==0){
			return "0";
		}
        int[] bin = new int[32];
        int index = 0;
        boolean flag = false; //need convert;
        if(num<0){
            num = -num;
            flag = true;
        }
        
        while(num!=0){
            bin[index] = num%2;
            num = num/2;
            index++;
        }
        
        if(flag){
            for(int i=0;i<32;i++){
                bin[i] = (bin[i]==0?1:0);
            }
            
            bin = addOne(bin,0);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=7;i>=0;i--){
            int[] sub = Arrays.copyOfRange(bin, 4*i, 4*(i+1));
            convert(sub,sb);
        }
        
        int charIndex = 0;
        while(true){
            if(sb.charAt(charIndex)=='0'){
                charIndex++;
            }else{
                break;
            }
        }
        
        return sb.substring(charIndex);
    }
    
    private static int[] addOne(int[] in,int index){
        in[index]++;
        
        if(in[index]==2){
            in[index]=0;
            return addOne(in,++index);
        }else{
            return in;
        }
    }
    
    private static void convert(int[] sub,StringBuilder sb){
        int num = sub[0] + sub[1]*2 + sub[2]*4 + sub[3] *8;
        if(num<10){
            sb.append(num);
        }else{
            switch(num){
                case 10:sb.append('a');break;
                case 11:sb.append('b');break;
                case 12:sb.append('c');break;
                case 13:sb.append('d');break;
                case 14:sb.append('e');break;
                case 15:sb.append('f');break;
            }
        }
        return;
    }

}
