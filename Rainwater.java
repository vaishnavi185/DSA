import java.util.*;

public class Rainwater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1};
        int n = arr.length;

        if (n == 0) {
            System.out.println("No rainwater trapped.");
            return;
        }

        int[] left = new int[n];
        int[] right = new int[n];

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        // Fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        // Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println("Total trapped rainwater: " + trappedWater + " units");
    }
}
