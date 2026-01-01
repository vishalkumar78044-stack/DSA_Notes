package binary_scarch;

public class scarch_in_decending {
    public static void main(String[] args) {
        int arr[] = {100, 91, 89, 76, 66, 52, 43, 35, 29, 13, 53};
        int tar = 89;
        int n = arr.length;
        int hi = n-1;
        int lo = 0;
        int ind = -1;
        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(arr[mid]<tar) hi = mid -1;
            else if (arr[mid]>tar) {
                lo = mid +1;
            }
            else {
                ind = mid;
                break;
//                System.out.println(mid+" "+ arr[mid]);println/println

            }

        }System.out.println(ind);

    }
}
