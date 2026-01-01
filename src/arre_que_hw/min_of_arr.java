package arre_que_hw;

public class min_of_arr {
    public static void main(String[] args) {
        int arr[] = {12,43,56,34,76,88,3,2,45,67};
        int min = arr[0];
        int i = 0;
        while (i<arr.length){
            if(min>arr[i]){
                min = arr[i];

            }
            i++;
        }
        System.out.println(min);
    }
}
