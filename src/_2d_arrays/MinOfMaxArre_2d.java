package _2d_arrays;

public class MinOfMaxArre_2d {
    public static void main(String[] args) {
        int [][] arr= {{1,2,31},{4,3,5},{1,7,3}};
        int brr[] = {Integer.MAX_VALUE};
        for(int i=0;i< arr.length;i++){
            int max =0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] > max) max = arr[i][j];
            }if(max<brr[0]) brr[0] = max;
        }
        System.out.println(brr[0]);

    }
}
