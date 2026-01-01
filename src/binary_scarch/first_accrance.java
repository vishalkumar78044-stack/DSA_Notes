package binary_scarch;

public class first_accrance {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8};
        int n = arr.length;
        int hi = n - 1;
        int lo = 0;
        int tar = 6;
        int ind = -1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (arr[mid]>tar) hi = mid-1;
            else if (arr[mid]<tar) {
                lo = mid+1;

            }
            else if (arr[mid] == tar){
                ind = mid;
                hi = mid - 1;
            }


        }
        System.out.print(ind);
    }
}
