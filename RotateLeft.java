import java.util.Scanner;
import java.util.Arrays;;

public class RotateLeft {
   int n = 5;
   int[] arr = {2,3,4,5,5};
    public static void main(String args[]){
        RotateLeft l = new RotateLeft();
        l.arr = l.Left(l.arr);
        System.out.println(Arrays.toString(l.arr));



    }
    public int[] Left(int[] arr) {
        int temp =arr[0];
        for(int i=1; i<n;i++){
            arr[i-1]=arr[i];
        } arr[n-1]=temp;
        return arr;
    }
}
