package arrays.logic_building;

import java.util.Arrays;

public class UnionArray {
    void main() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        System.out.println(Arrays.toString(unionArray(nums1, 5, nums2, 3)));
    }

    public int[] unionArray(int[] nums1, int m, int[] nums2, int n) {
    int[] result = new int[m + n];
    int i = 0, j = 0, k = 0;
    while (i < m && j < n) {
        int num;
        if (nums1[i] <= nums2[j]) {
            num = nums1[i++];
        } else {
            num = nums2[j++];
        }
        if (k == 0 || result[k - 1] != num) {
            result[k++] = num;
        }
    }
    while (i < m) {
        int num = nums1[i++];
        if (k == 0 || result[k - 1] != num) {
            result[k++] = num;
        }
    }
    while (j < n) {
        int num = nums2[j++];
        if (k == 0 || result[k - 1] != num) {
            result[k++] = num;
        }
    }
    return Arrays.copyOf(result, k);
}
}
