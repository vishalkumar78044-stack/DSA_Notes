package _2d_arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] arr= {{1,2,31,4},{4,3,5,7},{1,7,3,8},{2,7,3,1}};
        print(arr);
        System.out.println();
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

    }
    public static void print(int[][] arr){
        for (int[] a : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
