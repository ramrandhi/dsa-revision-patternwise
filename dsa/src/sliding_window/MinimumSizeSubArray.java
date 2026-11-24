package sliding_window;

public class MinimumSizeSubArray {

    void main() {
        int target = 15;
        int[] nums = {5, 1, 3, 5, 10, 7, 4, 9, 2, 8};
        System.out.println(minimumSizeSubArray(target, nums));
    }

    public int minimumSizeSubArray(int target, int[] nums) {
        int result = Integer.MAX_VALUE, sum = 0;
        int left = 0, right = 0;
        while (right < nums.length) {
            sum = sum + nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
