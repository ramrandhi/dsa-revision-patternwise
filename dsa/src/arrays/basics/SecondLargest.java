package arrays.basics;

public class SecondLargest {
    int secondLargestElement(int[] nums) {
        if(nums.length == 1) {
            return -1;
        }
        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxValue) {
                secondMaxValue = maxValue;
                maxValue = num;
            } else if (num < maxValue && num > secondMaxValue) {
                secondMaxValue = num;
            }
        }
        if(secondMaxValue == Integer.MIN_VALUE) return -1;
        return secondMaxValue;
    }

    void main() {
        int[] nums = {5,5,4,4,3,1};
        System.out.println(secondLargestElement(nums));
    }
}
