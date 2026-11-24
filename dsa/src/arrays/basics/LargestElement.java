package arrays.basics;

public class LargestElement {
    public int largestElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int largestElement = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++) {
            int maxElement = Math.max(nums[i], nums[i+1]);
            largestElement = Math.max(largestElement, maxElement);
        }
        return largestElement;
    }
}
