import java.util.Arrays;

public class Solution {
	
	 static int hurdleRace(int k, int[] height) {
	        
	        int hurd=0;
	        Arrays.sort(height);
	        int max=height[height.length-1];
	        if(max>k){
	            hurd= max-k;
	        }
	        return hurd;

	    }
	 
	 public static void main(String[] args) {
		 int  height[]=new int[] {1,6,3,5,2};
		 hurdleRace(4, height);
	}

}
