package subject;

import java.util.Arrays;

public class Selection_sort {

	static int[] nums;
	
	public static void main(String[] args) {
		nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 10);
		}
		System.out.println("<정렬 전>");
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length - 1; i++) {
			
			int MinIndex = i;
			
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[MinIndex] > nums[j])
					MinIndex = j;
			}
			
			int temp = nums[MinIndex];
			nums[MinIndex] = nums[i];
			nums[i] = temp;
		}
		
		System.out.println("<정렬 후>");
		System.out.println(Arrays.toString(nums));
		
	}
	

}
