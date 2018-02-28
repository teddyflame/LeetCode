package algorithms;

public class Q474 {
	
	public static void main(String[] args) {
		Q474 q474 = new Q474();
		
		String[] strs = {"10", "0001", "111001", "1", "0"};
		int out = q474.findMaxForm(strs, 5, 3);
		
		System.out.println(out);
	
	}
	
	int res = 0;
    public int findMaxForm(String[] strs, int m, int n) {
        search(strs,0,m,n,0);
        return res;
    }
    
    private void search(String[] strs,int index,int m,int n,int nums){
        if(index>=strs.length)return;
        
        search(strs,index+1,m,n,nums);
        
        int zeros = hasZeros(strs[index]);
        int ones = hasOnes(strs[index]);
        if(m>=zeros && n>=ones){
            nums++;
            m-=zeros;
            n-=ones;
            if(nums>res)res = nums;
            search(strs,++index,m,n,nums);
        }
    }
    
    private int hasZeros(String s){
        int zeros = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')zeros++;
        }
        
        return zeros;
    }
    
    private int hasOnes(String s){
        int ones = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')ones++;
        }
        
        return ones;
    }

}
