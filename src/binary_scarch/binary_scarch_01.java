package binary_scarch;

public class binary_scarch_01 {
    public static void main(String[] args) {
        int[] arr = {12,43,56,8,65,34,56,89,23,56,76,34};
        int tar = 65;
        int n = arr.length;
        int j =n-1;
        int i = 0;
        while(i > j){
            int mid = (i+j)/2;
            if(arr[mid] == tar){
                System.out.print("mid+1");
            }
            else if (arr[mid]<tar) {
                i = mid + 1;
            }
            else if (arr[mid]>tar) {
                j =mid - 1;
            }
            else System.out.println("not found");
        }
    }
}
