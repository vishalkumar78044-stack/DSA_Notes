package bubble_selection_sort;

public class short_0_in_side_02 {
    public static void main(String[] args) {
        int arr[] = {2,43,12,0,43,23,0,23,45,32,0,43};
        int n= arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
