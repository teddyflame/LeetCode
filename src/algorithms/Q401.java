package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q401 {

	public static void main(String[] args) {

		
		List<String>  resultList = readBinaryWatch(3);
		
		for(int i=0;i<resultList.size();i++){
			System.out.println(resultList.get(i));
		}
	}
	
    public static List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        int[] nums1 = {8, 4, 2, 1};
        int[] nums2 = {32, 16, 8, 4, 2, 1};
        
        for(int i = 0; i <= num; i++) {
            List<Integer> list1 = generateDigit(nums1, i);
            List<Integer> list2 = generateDigit(nums2, num - i);
            for(int num1: list1) {
                if(num1 >= 12) continue;
                for(int num2: list2) {
                    if(num2 >= 60) continue;
                    res.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
                }
            }
        }
        return res;
    }

    private static List<Integer> generateDigit(int[] nums, int count) {
        List<Integer> res = new ArrayList<>();
        generateDigitHelper(nums, count, 0, 0, res);
        return res;
    }

    private static void generateDigitHelper(int[] nums, int count, int pos, int sum, List<Integer> res) {
        if(count == 0) {
            res.add(sum);
            return;
        }
        
        for(int i = pos; i < nums.length; i++) {
            generateDigitHelper(nums, count - 1, i + 1, sum + nums[i], res);    
        }
    }

}
