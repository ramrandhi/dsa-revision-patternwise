package java8;

import java.util.Arrays;
import java.util.List;

public class Streams {
    void main() {
        int[] arr = {1,5,6,9,2,3};
        List<Integer> sortedArray = Arrays.stream(arr).boxed().sorted().toList();
        System.out.println(sortedArray);
    }
}
