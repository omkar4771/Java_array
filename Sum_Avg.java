//calculate sum & average of an array elements
package array;
import java.util.Scanner;
public class Sum_Avg 
{

	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("How many element you want to enter");
		n=sc.nextInt();
		
		System.out.println("Enter the element");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given element are :");
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]+"\t");
		}
		for(int k=0;k<n;k++)
		{
			sum=sum+a[k];
		}
		System.out.println("\nSum of given element are :"+sum);
		System.out.println("Average of given element are : "+sum/n);
		
		
		
	}

}
