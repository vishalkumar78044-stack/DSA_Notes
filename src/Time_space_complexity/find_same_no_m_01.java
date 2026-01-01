package Time_space_complexity;

public class find_same_no_m_01 {
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,4,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if( arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
