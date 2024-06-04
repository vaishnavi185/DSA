import java.util.*;

public class RemovDuplicate {

public static void main(String args[]){
  int size;
  Scanner scanner = new Scanner(System.in);
  size = scanner.nextInt();

  int[] arr = new int[size];
  System.out.print("enter array :");
  for(int i=0;i<size ; i++){
    arr[i]=scanner.nextInt();
  }
  RemovDuplicate remove = new RemovDuplicate();
  int[] uniqueArr = remove.RemoveDup(arr);

  System.out.println("Unique elements:");
  for (int num : uniqueArr) {
    System.out.print(num + " ");
  }
}


public int[] RemoveDup(int[] arr) {
  int[] temp = new int[arr.length]; // Create a temporary array to store unique elements
  int j = 0; // Index for temp array

  for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i] != arr[i + 1]) { // Check if current element is different from next
      temp[j++] = arr[i]; // Add unique element to temp array and increment j
    }
  }

  // Add the last element (not compared in the loop)
  temp[j++] = arr[arr.length - 1];

  // Use Arrays.copyOfRange to create a new array with actual unique elements
  return Arrays.copyOfRange(temp, 0, j); 
}
}
