package binary_scarch;

public class mountain_peak_02 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,5,4,3,2};
        int n = arr.length-2;
        int hi = n-1;
        int lo = 1;
        int ans = 0;

        while (lo<=hi){
            int mid = (hi+lo)/2;
            if(arr[mid-1]<arr[mid] &&arr[mid]>arr[mid+1]){
               ans = arr[mid];
            }
            else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){
                lo = mid+1;

            }
            else {
                hi = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
