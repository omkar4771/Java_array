package array;
import java.util.*;
public class Multiarraysum 
{
	public static void main(String[] args)
	{
		int r,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of row and column :");
		r=sc.nextInt();
		c=sc.nextInt();
		int n=r*c;
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int add[][]= new int[r][c];
		System.out.println("Enter the array A :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Enter the array B :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of A + B :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				add[i][j]=a[i][j]+b[i][j];
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}

}
