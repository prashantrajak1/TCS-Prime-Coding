import java.util.*; 
public class Main
{
    public static void solve(int arr[],int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        boolean found = false;
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println(entry.getKey()+" ");
                found = true;
            }
        }
        
        if(!found)
        {
            System.out.println("No repeating element");
            
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
		  arr[i] = sc.nextInt();   
		}
		
		//ArrayList<Integer> ans = 
		solve(arr,n);
		
		//System.out.print(ans);
	}
}
