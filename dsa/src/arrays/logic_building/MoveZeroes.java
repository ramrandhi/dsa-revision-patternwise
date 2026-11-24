package arrays.logic_building;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        if(nums.length < 2) {
            return;
        }
        int left = 0;
        int right = 0;
        for(int n: nums) {
            if(n == 0) {
                right++;
            } else {
                if(left != right) {
                    nums[left++] = nums[right++];
                } else {
                    left++;
                    right++;
                }
            }
        }
        while(left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }   
}
