import java.util.Scanner;

public class SecondLargest {
    private int size;
    private int[] numbers;

    // Constructor to initialize the array based on user input
    public SecondLargest() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        size = scanner.nextInt();

        // Check if the size is less than 2
        if (size < 2) {
            System.out.println("Error: Enter size more than 2");
            System.exit(1);
        }

        // Initialize the array
        numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close(); // Close the scanner
    }

    public static void main(String[] args) {
        SecondLargest slarge = new SecondLargest();
        int value = slarge.SecLarge(slarge.numbers);
        System.out.println("Second largest is: " + value);
    }

    public int SecLarge(int[] num) {
        if (num.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > large) {
                slarge = large;
                large = num[i];
            } else if (num[i] > slarge && num[i] != large) {
                slarge = num[i];
            }
        }

        // Check if the second largest number was found
        if (slarge == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two unique numbers");
        }

        return slarge;
    }
}
