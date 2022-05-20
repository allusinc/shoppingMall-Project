package subject;

import java.util.Arrays;

public class Buble_sort {
	
static int[] nums;
	
	public static void main(String[] args) {
		nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 10);
		}
		System.out.println("<정렬 전>");
		System.out.println(Arrays.toString(nums));
	
	

	    for(int i = 0; i < nums.length; i++) {
	        for(int j = 0 ; j < nums.length - i - 1 ; j++) {
	            if(nums[j] > nums[j+1]) {
	                int temp = nums[j+1];
	                nums[j+1] = nums[j];
	                nums[j] = temp;
	            }
	        }
	    }

	System.out.println("<정렬 후>");
	System.out.println(Arrays.toString(nums));
}
}