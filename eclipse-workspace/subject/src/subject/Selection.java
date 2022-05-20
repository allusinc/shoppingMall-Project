package subject;

import java.util.Arrays;

public class Selection {
	
	
	
	public static void main(String[] args) {
		String[] arr = "10 2 7 3 8".split(" ");	
		int[] nums=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			nums[i]=Integer.parseInt(arr[i]);			
		}
		for(int i:nums) {
			System.out.println(i);
		}

		for (int i = 0; i < nums.length - 1; i++) {

			int MinIndex = i;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[MinIndex] > nums[j])
					MinIndex = j;
			}

			int temp = nums[MinIndex];
			nums[MinIndex] = nums[i];
			nums[i] = temp;
		}

//		JSONObject selection_json=new JSONObject();
//		selection_json.put("Selection_sort", nums);
//		model.addAttribute("selection_json", selection_json);
	}

}
