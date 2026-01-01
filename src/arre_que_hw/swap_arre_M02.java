package arre_que_hw;

public class swap_arre_M02 {
    public static void main(String[] args) {
        int arr[] = {23,5,35,78,54,34,86};
        int n = arr.length;
        for(int i=0;i< n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
