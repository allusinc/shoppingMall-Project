package subject;

import java.util.Arrays;

public class Insert_sort {

		static int[] nums;
		
		public static void main(String[] args) {
			nums = new int[10];
			for (int i = 0; i < 10; i++) {
				nums[i] = (int) (Math.random() * 10);
			}
			System.out.println("<���� ��>");
			System.out.println(Arrays.toString(nums));
		
			for (int i = 1; i< nums.length; i++) {
				int temp = nums[i];
			
				int prev = i - 1;

				while(prev >= 0 && nums[prev] > temp) {
			
					nums[prev + 1] = nums[prev];
				
					prev--;
				}
	
				nums[prev + 1] = temp;
			}

	        
			 System.out.println("<���� ��>");
			 System.out.println(Arrays.toString(nums));
		 }
	 }
	 