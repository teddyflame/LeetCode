package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q763 {

	public static void main(String[] args) {
		String string = "ababcbacadefegdehijhklij";
		
		List<Integer> resIntegers = partitionLabels(string);
		
		System.out.println("");

	}
	
	public static List<Integer> partitionLabels(String S) {
		List<Integer> res = new ArrayList<Integer>();
		while(S.length()>0){
			char target = S.charAt(0);
			//1、查末位的首字符
			int pos = checkEndChar(S,target);
			if(pos==0){
				res.add(1);
				S = S.substring(1);
				continue;
			}
			boolean flag = false;
			List<Character> oldChars = new ArrayList<>();
			oldChars.add(target);
			//2、找到串中所有其他的字符
			List<Character> chars = findChars(S,oldChars,0,pos);
			while(!flag){
				//如果串中没有其他字符,就可以统计并截取
				if(chars.size()==0){
					S = S.substring(pos+1);
					res.add(pos+1);
					break;
				}
				//3、找其他字符的最远位置
				int fastPos = 0;
				for(int i=0;i<chars.size();i++){
					fastPos = Math.max(fastPos,  checkEndChar(S, chars.get(i)));
				}
				//如果其他字符最远位置没超过串长，就可以统计并截取
				if(fastPos<=pos){
					S = S.substring(pos+1);
					res.add(pos+1);
					break;
				}else{//否则重新统计其他字符
					oldChars.addAll(chars);
					chars = findChars(S, oldChars, pos,fastPos);
					pos = fastPos;
				}				
			}
		}
		
		return res;
    }
	
	/**
	 * 找到规定范围内的所有不在old集中的字符并返回
	 * @param S
	 * @param oldChars
	 * @param startPos
	 * @param endPos
	 * @return
	 */
	private static List<Character> findChars(String S,List<Character> oldChars,
								int startPos,int endPos){
		List<Character> res = new ArrayList<>();
		for(int i=startPos+1;i<=endPos;i++){
			char tmp = S.charAt(i);
			if(!oldChars.contains(tmp) && !res.contains(tmp)){
				res.add(tmp);
			}
		}
		return res;
	}
	
	/**
	 * 查一个字符出现的最末位
	 * @param in
	 * @param target
	 * @return
	 */
	private static int checkEndChar(String in,char target){
		for(int i=in.length()-1;i>0;i--){
			if(in.charAt(i)==target){
				return i;
			}
		}		
		return 0;
	}
	

}
