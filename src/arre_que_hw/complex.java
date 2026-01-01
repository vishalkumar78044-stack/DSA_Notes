package arre_que_hw;

public class complex {
    public static void main(String[] args) {
        int arr[] = {2,4,30,61,34,12,10};

        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0 || arr[i] == 0){
                arr[i] += 10;
            }
            else{
                arr[i] *= 2;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
