package bubble_selection_sort;

public class insertion_short {
    public static void main(String[] args) {
        int arr[] = {2,43,12,0,43,23,0,23,45,32,0,43};
        int n = arr.length;
        for(int i=0;i< arr.length;i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }
        }
        for(int ele : arr) System.out.print(ele +" ");
    }
}
