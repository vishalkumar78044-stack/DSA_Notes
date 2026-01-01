package copy;

import java.util.Arrays;

public class Deep_copy_array_03 {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4};
        int arr2 [] = Arrays.copyOf(arr1,arr1.length);
        // for me it is sabase bekar method
    }
}
