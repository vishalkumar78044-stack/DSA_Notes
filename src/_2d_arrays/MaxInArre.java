package _2d_arrays;

public class MaxInArre {
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,3,5},{1,7,3}};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max) max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
