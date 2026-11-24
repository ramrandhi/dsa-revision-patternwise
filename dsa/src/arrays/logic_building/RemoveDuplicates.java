package arrays.logic_building;

public class RemoveDuplicates {
    void main() {
        int[] nums = {0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                nums[++left] = nums[right];
            }
        }
        return left + 1;
    }
}
