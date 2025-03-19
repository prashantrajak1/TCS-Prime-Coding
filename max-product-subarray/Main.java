import java.util.*;

public class Main {
    public static int maxProductSubarray(int[] arr) {
        if (arr.length == 0) return 0;

        int maxProd = arr[0];  // Stores the maximum product found
        int minProd = arr[0];  // Stores the minimum product (for negative numbers)
        int result = arr[0];   // Stores the final result

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {  // Swap maxProd and minProd if current element is negative
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Calculate new max and min products
            maxProd = Math.max(arr[i], maxProd * arr[i]);
            minProd = Math.min(arr[i], minProd * arr[i]);

            // Update result
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum product subarray: " + maxProductSubarray(arr));

        sc.close();
    }
}
