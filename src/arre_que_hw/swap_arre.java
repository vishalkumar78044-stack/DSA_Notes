package arre_que_hw;

public class swap_arre {
    public static void main(String[] args) {
        int arr[] = {23,5,35,78,54,34,86};
        int i = 0;
        int n = arr.length;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }


}
