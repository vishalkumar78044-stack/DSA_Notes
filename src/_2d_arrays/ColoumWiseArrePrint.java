package _2d_arrays;

public class ColoumWiseArrePrint {
    public static void main(String[] args) {
        int [][] arr= {{1,2,31},{4,3,5},{1,7,3}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
