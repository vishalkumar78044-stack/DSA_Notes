package _2d_arrays;

public class ForEach_arre_print {
    public static void main(String[] args) {
        int [][] arr= {{1,2,31},{4,3,5},{1,7,3}};
        for(int[] a : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
