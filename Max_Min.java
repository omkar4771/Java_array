//find max & min from an array
package array;
import java.util.Scanner;
public class Max_Min 
{
	public static void main(String[] args)
	{
		int n,max,min;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter How many element you want to enter :");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("You entire element are :");
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]+"\t");
		}
		max=min=a[0];
		for(int k=0;k<n;k++)
		{
			if(a[k]>max)
			{
				max=a[k];
			}
			if(a[k]<min)
			{
				min=a[k];
			}
		}
		System.out.println("\nMax element are :"+max);
		System.out.println("Min element are :"+min);
	}

}
