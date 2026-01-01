package _2d_arrays;

public class sumOf_2dArre {
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,3,5},{1,7,3}};
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
