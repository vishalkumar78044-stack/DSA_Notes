package arre_que_hw;

public class product_of_arre {
    public static void main(String[] args) {
        int arr[] = {2,53,10};
        int pro = 1;
        int i = 0;
        while (i<arr.length){
            pro *= arr[i];
            i++;
        }
        System.out.println(pro);
    }
}
