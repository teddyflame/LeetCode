package algorithms;

public class Q447 {

	public static void main(String[] args) {

		int[][] in={{1,1},{2,2},{3,3}};
		System.out.println(numberOfBoomerangs(in));
	}
	
	public static int numberOfBoomerangs(int[][] points) {
        if(points.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<points.length;i++){
            
            for(int j=0;j<points.length;j++){
                if(j==i)continue;
                int a = points[i][0];
                int b= points[j][0];
                int c = (int)Math.pow((points[i][0]-points[j][0]),2);
                
                int distance_ab = (int)Math.pow((points[i][0]-points[j][0]),2) 
                		+ (int)Math.pow((points[i][1]-points[j][1]),2); 
                
                for(int k=0;k<points.length;k++){
                    if(k==i||k==j)continue;

                    int distance_ac =  (int)Math.pow((points[i][0]-points[k][0]),2) 
                    		+ (int)Math.pow((points[i][1]+points[k][1]),2); 
                    if(distance_ab == distance_ac){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }

}
