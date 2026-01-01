package _2d_arrays;

public class SnackPrintColumWise {
    public static void main(String[] args) {
        int [][] arr= {{1,2,31},{4,3,5},{1,7,3},{2,9,1}};
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<c;i++){
            if(i==0 || i%2==0) {
                for(int j=0;j<r-1;j++){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
            else  {
                for(int j=r-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}
