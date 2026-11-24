package arrays.logic_building;

public class MissingNumber {
    void main() {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n+1)/2;
        int expectedSum = 0;
        for(int num: nums) {
            expectedSum += num;
        }
        return totalSum - expectedSum;
    }   
}
