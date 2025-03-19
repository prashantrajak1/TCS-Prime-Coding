import java.util.*;

public class Main {
    public static int countGreaterElementsthanprior(int[] arr) {
        
        if(arr.length == 0)
        {
            return 0;
        }
        
        int max = arr[0];
        int count=1;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                count++;
                max = arr[i];
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = countGreaterElementsthanprior(arr);
        System.out.println("Count of elements greater than all prior elements: " + count);
        
        scanner.close();
    }
}
