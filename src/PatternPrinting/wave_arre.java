package PatternPrinting;

public class wave_arre {
    public static void main(String[] args) {
        int arr[] = {12,43,32,34,54,23,23};
        for(int i=0;i<arr.length - 1;i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
