package missing;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberFunction {
	public int missingNumber(int[] nums) {
//		// result will be the length since the for loop only go til nums.length - 1
//		int result = nums.length;
//
//		for (int i = 0; i < nums.length; i++) {
//			// a ^ b ^ b = a, a ^ a ^ b ^ b ^ c = c, basically getting the only
//			// one that did not appear twice.
//			result = result ^ i ^ nums[i];
//		}
// return result
		
		// Store all the element in the array in hashset
		Set<Integer> set = new HashSet<>();
		
		// solution will always be 0 in case the list is empty
		// IMPORTANT if smallest number could only be 1, then change solution to 1 and the for loop number = 1 with number <= num.length
		int solution = 0;
		
		// store all the integer into set without duplicates
		for(int i = 0; i < nums.length; i++){
			set.add(nums[i]);
		}
		
		// starting from 1 to the whole length, it will always get the missing lowest positive number
		for(int number = 0; number < nums.length; number++){
			// Whenever the smallest value is in the array, solution will change to next smallest value
			if(set.contains(number) && solution == number){
				solution++;
			}
		}

		return solution;
	}
}
