package _2d_arrays;

public class MaxInArre02 {
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,3,5},{1,7,3}};
        int max = Integer.MIN_VALUE;
        int ind = -1;
        int maxSum = 0;
        for(int i=0;i< arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[0].length;j++){
                sum += arr[i][j];

            }
            if(sum > maxSum) maxSum = sum; ind = i;
        }
        System.out.println(maxSum+" "+ind);
    }
}
