package bubble_selection_sort;

public class selection_short {
    public static void main(String[] args) {
        int arr[] = {2,43,12,0,43,23,0,23,45,32,0,43};
        for(int j=0;j< arr.length-1;j++){
            int min = Integer.MAX_VALUE;
            int ind = -1;
            for(int i=j;i< arr.length;i++){
                if(arr[i]<min) {
                    min = arr[i];
                    ind = i;
                }
            }

            int temp = arr[j];
            arr[j] = arr[ind];
            arr[ind] = temp;

        }
        for(int k=0; k< arr.length;k++)
            System.out.print(arr[k]+" ");

    }
}
