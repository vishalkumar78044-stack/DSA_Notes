package Arre;

public class for_each_loop {
    public static void main(String[] args) {
        int arr[] = {2,45,74,23,78,45,32,56};
        // for each only will show or print element it will not change the element
        for(int ele : arr){
            ele *= 2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
