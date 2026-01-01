package arre_que_hw;

public class max_of_arr{
    public static void main(String[] args) {
        int arr[] = {12,43,56,75,34,67};
        int max = 0;

        int i =0;
        while (i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        System.out.println(max);
    }
}
