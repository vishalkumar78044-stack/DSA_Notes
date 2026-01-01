package arre_que_hw;

public class _2nd_largest {
    public static void main(String[] args) {
        int arr[] = {2,54,43,67,43,56};
        int max = 0;
        int smax =0;

        for(int i =0; i<arr.length;i++){
            if(arr[i]>max) max = arr[i];

        }
        for(int i =0; i<arr.length;i++){
            if(arr[i]>smax && arr[i] != max) smax =arr[i];
        }
        System.out.println(smax);
        System.out.println(max);

    }
}
