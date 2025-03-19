//rotation of matrix for 90 degree in counterclockwise

import java.util.*;


public class Main
{
    public static void solvefunction(int mat[][],int n)
    {
        
        //transpose of the matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        //reverse each column
          for(int i=0;i<n;i++)
        {
            for(int j=0,k=n-1;j<k;j++,k--)
            {
                int temp = mat[j][i];
                mat[j][i] = mat[k][i];
                mat[k][j] = temp;
            }
        }
        
         
        for(int[] row:mat)
        {
            System.out.println(Arrays.toString(row));
        }
        
        
        
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int mat[][] = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        mat[i][j]  = sc.nextInt();
		        
		    }
		}
		
		solvefunction(mat,n);
	}
}
