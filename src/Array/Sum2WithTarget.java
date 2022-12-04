package Array;

import java.util.HashMap;
import java.util.Map;

//time complexity o(n) and space complexity o(n)

public class Sum2WithTarget {

	public static void main(String arg[]) {
		int[] a = { 2, 6, 3, 15 };
		int target = 9;
		Sum2WithTarget s = new Sum2WithTarget();
		int result[] = s.twoSum(a, target);
		System.out.println(result[0]+" "+result[1]);
	}

	public int[] twoSum(int[] nums, int target) {

		int[] result = new int[nums.length];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(target - nums[i])) {

				result[0] = map.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}

		return result;
	}
}
