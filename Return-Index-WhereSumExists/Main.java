//Return the index from where the sum exists

import java.util.*;

public class Main
{
    public static ArrayList<Integer> solve(int arr[],int target)
    {
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int sum = 0;
            for(int j=i;j<arr.length;j++)
            {
               sum += arr[j];
               
               if(sum == target)
               {
                   res.add(i+1);
                   res.add(j+1);
                   return res;
               }
            }
        }
        //if target not found in array return -1
        res.add(-1);
        return res;
    }
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
		
		
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> ans = solve(arr,target);
        
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
	}
}
