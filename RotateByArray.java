import java.util.Scanner;

public class RotateByArray {

   void leftRotate(int d, int n, int arr[]) {
       d = d % n; // In case d is greater than n
       int[] temp = new int[d];

       // Copy the first d elements to a temporary array
       for (int i = 0; i < d; i++) {
           temp[i] = arr[i];
       }

       // Shift the remaining elements of arr[] to the left
       for (int i = 0; i < n - d; i++) {
           arr[i] = arr[i + d];
       }

       // Copy the temporary array elements back to the end of arr[]
       for (int i = 0; i < d; i++) {
           arr[n - d + i] = temp[i];
       }
   }

   void printArr(int arr[], int n) {
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }

   public static void main(String[] args) {
       RotateByArray rotate = new RotateByArray();
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter the number of elements in the array: ");
       int n = scanner.nextInt();
       int[] arr = new int[n];
       
       System.out.println("Enter the elements of the array:");
       for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
       }

       System.out.print("Enter the number of positions to rotate: ");
       int d = scanner.nextInt();
       
       rotate.leftRotate(d, n, arr);
       System.out.println("Array after left rotation:");
       rotate.printArr(arr, n);

       scanner.close();
   }
}
