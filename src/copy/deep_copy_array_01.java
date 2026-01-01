package copy;

public class deep_copy_array_01 {
    public static void main(String[] args) {
//        deep copy method 01
//        changing copy will not affect original
        int arr1[] = {1,23,4};
        int arr2[] = new int[arr1.length];

        for (int i=0;i< arr1.length;i++){
            arr2[i] = arr1[i];
        }
        for (int ele : arr2){
            System.out.print(arr2[ele]+" ");
        }
        System.out.println(" ");
        for (int ele : arr1){
            System.out.print(arr1[ele]+" ");
        }
    }
}
