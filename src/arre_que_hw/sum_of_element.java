package arre_que_hw;

public class sum_of_element {
    public static void main(String[] args) {
        int arr[] = {12,34,54,65,23,76};
        int sum = 0;

        int i = 0;
        while(i<arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
