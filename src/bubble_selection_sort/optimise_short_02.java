package bubble_selection_sort;

public class optimise_short_02 {
    public static void main(String[] args) {
        int arr[] = {12,54,21,11,16,43,45,87,34};

        for(int j=0;j<arr.length - 1;j++) {
            int swap = 0;
            for (int i = 0; i < arr.length - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap ++;
                }
            if(swap == 0) break;
        }
        for(int k=0;k< arr.length;k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
