package bubble_selection_sort;

public class short_0_in_side {
    public static void main(String[] args) {
        int arr[] = {2,43,12,0,43,23,0,23,45,32,0,43};
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i< arr.length-1;i++){
                if(arr[i] ==0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
