package copy;

public class shallow_copy_array {
    public static void main(String[] args) {
        int arr1[] = {1,23,3};
        int arr2[] = arr1; // shallow copy
        arr2[0]  = 99;
        for(int ele : arr1){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        for(int ele : arr2){
            System.out.print(ele+" ");
        }
        // shallow copy
//        by changing this array original will also change
//        and this copy address not copy
//        whole element of array.
    }
}
