import java.util.*;

public class Main
{
    public static ArrayList<Integer> solve(int[] arr,int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int val = entry.getValue();
            
            for(int i=0;i<val;i++)
            {
                res.add(key);
            }
            
        }
        
        return res;
        
        
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] strarr = str.split(",");
		
		int n = strarr.length;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = Integer.parseInt(strarr[i]);
		}
		
		ArrayList<Integer> ans = solve(arr,n);
		for(int ele:ans)
		{
		    System.out.print(ele+" ");
		}
	}
}
