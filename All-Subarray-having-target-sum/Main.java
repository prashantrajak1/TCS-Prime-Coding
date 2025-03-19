//To find all the subarrays which has the target sum

import java.util.*;

public class Main
{
    public static ArrayList<Integer> solve(int arr[],int target)
    {
        int n =arr.length;
        //int sum = 0;
        
        boolean found = false;
        
       
        
        for(int i=0;i<n;i++)
        {
            int sum = 0;
             ArrayList<Integer> res = new ArrayList<>();
            for(int j=i;j<n;j++)
            {
                sum += arr[j];
                res.add(arr[j]);
                
                if(sum == target)
                {
                   System.out.println(res);
                }
                
            }
        }
        
        return new ArrayList<>();
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		ArrayList<Integer> ans = solve(arr,target);
		
		for(int ele: ans)
		{
		    System.out.println(ele+" ");
		}
	}
}
