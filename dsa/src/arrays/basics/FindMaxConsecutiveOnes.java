package arrays.basics;

public class FindMaxConsecutiveOnes {
    void main() {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int onesCount = 0;
        for(int n: nums) {
            if(n == 1) {
                onesCount++;
            } else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, onesCount);
                onesCount = 0;
            }
        }
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, onesCount);
        return maxConsecutiveOnes;
    }
}
