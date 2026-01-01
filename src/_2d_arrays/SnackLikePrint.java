package _2d_arrays;

public class SnackLikePrint {
    public static void main(String[] args) {
        int [][] arr= {{1,2,31},{4,3,5},{1,7,3}};
        for(int i=0;i<arr.length;i++){
            if(i==0 || i%2==0) {
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else  {
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
