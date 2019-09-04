package missing;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {0,1,2,4};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMissingNumberFunction solution = new FindMissingNumberFunction();
		
		System.out.println("Solution: " + solution.missingNumber(nums));
	}
}
