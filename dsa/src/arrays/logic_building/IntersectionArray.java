package arrays.logic_building;

import java.util.Arrays;

public class IntersectionArray {
    void main() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        System.out.println(Arrays.toString(intersectionArray(nums1, nums2)));
    }
    private int[] intersectionArray(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] result = new int[Math.min(m, n)];
        int index = 0, left = 0, right = 0;
        while(left < m && right < n) {
            if(nums1[left] == nums2[right]) {
                if(index == 0 || result[index - 1] != nums1[left]) {
                    result[index++] = nums2[right];
                }
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
