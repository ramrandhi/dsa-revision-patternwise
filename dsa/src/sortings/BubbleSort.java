package sortings;

import java.util.Arrays;

public class BubbleSort {
    void bubble(int[] arr) {
        for(int i = 0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    void main() {
        int[] arr = {5,1,3,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
