package algorithms;

public class Q42 {

	public static void main(String[] args) {

		int[] in = {5,2,1,2,1,5};
		
		System.out.println(trap(in));
	}
	
    public static int trap(int[] height) {
        if(height==null || height.length==0)return 0;
        int sum=0;

        int left = -1;
        int right = -1;
     //   List<Integer> list = new ArrayList<>();

        //find left
        int i=1;
        while(i<height.length){
            if(height[i]<height[i-1]){
                left = i-1;
                break;
            }else{
                i++;
            }         
        }
        
        if(left<0)return 0;
        
        i=height.length-2;
        while(i>=0){
            if(height[i]>height[i+1]){
                i--;
            }else{
                right = i+1;
                break;
            }
        }
        
        if(right<0)return 0;
        
        int posL = left;
        
        //list.add(left);
        for(int j=left+2;j<right-1;j++){
            if(height[j]>height[j+1] && height[j]>height[j-1]){
                sum+= calc(height,posL,j);
                posL = j;
            }
        }
        
        sum+=calc(height,posL,right);
            
        return sum;
    }
    
    private static int calc(int[] height,int left,int right){
        int sum=0;
        int level = Math.min(height[left],height[right]);
        for(int i=left+1;i<right;i++){
        	if(height[i]<level){
        		sum+= level-height[i];
        	}
            
        }
        
        return sum;
    }
    

}
