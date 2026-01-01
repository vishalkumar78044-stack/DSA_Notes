package _2d_arrays;

public class arre_2d_03 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,3,5},{1,7,3}};
        int [][] brr = {{1,2,3},{4,3,5},{1,7,3}};
        brr[1][2] = 20;
        System.out.println(arr[1][2]);
        //change nahe hua yane ye address nahe hai
        //new arre bana raha hai
    }
}
