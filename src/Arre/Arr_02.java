package Arre;

public class Arr_02 {
    public static void main(String[] args) {
        int[] arr = new int[4]; // 4 size ka array | 0 to 3 { means can store 4 things }
        arr[0] = 10;
        arr[1] = 23;
        arr[2] = 45;
        arr[3] = 65;
        System.out.println(arr[3]);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
