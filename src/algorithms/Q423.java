package algorithms;

import java.util.Arrays;

public class Q423 {

	public static void main(String[] args) {
		
	}
	
	public static String originalDigits(String s) {
        
		char[] input = s.toCharArray();
		
		int index = 0;
		
		int f_num =0;	//-4=5
		int g_num =0;	//8
		int i_num =0;	//-5-6-8=9;
		int o_num =0;	//-0-2-4=1
		int s_num =0;	//-6=7
		int t_num =0;	//-2-8=3
		int u_num =0;	//4
		int w_num =0;	//2
		int x_num =0;	//6
		int z_num =0;	//0

		while(index<input.length){
			switch(input[index]){
			case 'f': f_num++;break;
			case 'g': g_num++;break;
			case 'i': i_num++;break;
			case 'o': o_num++;break;
			case 's': s_num++;break;
			case 't': t_num++;break;
			case 'u': u_num++;break;
			case 'w': w_num++;break;
			case 'x': x_num++;break;
			case 'z': z_num++;break;
			}
			
			index++;
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<z_num;i++){
			sb.append('0');
		}
		
		for(int i=0;i<(o_num-z_num-w_num-u_num);i++){
			sb.append('1');
		}
		
		for(int i=0;i<w_num;i++){
			sb.append('2');
		}
		for(int i=0;i<t_num-w_num-g_num;i++){
			sb.append('3');
		}
		for(int i=0;i<u_num;i++){
			sb.append('4');
		}
		for(int i=0;i<f_num-u_num;i++){
			sb.append('5');
		}
		for(int i=0;i<x_num;i++){
			sb.append('6');
		}
		for(int i=0;i<s_num-x_num;i++){
			sb.append('7');
		}
		for(int i=0;i<g_num;i++){
			sb.append('8');
		}
		for(int i=0;i<f_num+u_num-x_num-g_num;i++){
			sb.append('9');
		}
		
		return sb.toString();
		
    }

}
