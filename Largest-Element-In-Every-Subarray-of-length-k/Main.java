// to find the max element in every contiguos subarray of size k
import java.util.*;

public class Main
{
    public static ArrayList<Integer> solve(int[] arr,int k)
    {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int n = arr.length;
        
        
        for(int i=0;i<=n-k;i++)
        {
            int max = arr[i];
            for(int j=i;j<i+k;j++)
            {
                max = Math.max(arr[j],max);
            }
            res.add(max);
        }
        
        return res;
        
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int[] arr = new int[n];
		int k = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> ans = solve(arr,k);
		
		for(int ele:ans)
		{
		    System.out.println(ele+" ");
		}
	}
}
