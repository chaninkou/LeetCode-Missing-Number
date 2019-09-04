package missing;

public class FindMissingNumberFunction {
	public int missingNumber(int[] nums) {
		// result will be the length since the for loop only go til nums.length - 1
		int result = nums.length;

		for (int i = 0; i < nums.length; i++) {
			// a ^ b ^ b = a, a ^ a ^ b ^ b ^ c = c, basically getting the only
			// one that did not appear twice.
			result = result ^ i ^ nums[i];
		}

		return result;
	}
}
