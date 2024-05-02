//Accept array from user & print pronic numbers from array
package array;
import java.util.Scanner;
public class Pronic_num 
{
	public static void main(String[] args) 
	{
		int n,n1,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		int omkar[]=new int[n];
		System.out.println("Enter array element");
		for (int i=0;i<n;i++)
		{
			omkar[i]=sc.nextInt();
		}
		System.out.println("Entire element are :");
		for(int j=0;j<n;j++)
		{
			System.out.print(omkar[j]+"\t");
		}
		System.out.println("\nPronic number are :");
		for(int k=0;k<n;k++)
		{
			n1=omkar[k];
			sum=0;
			for(int j=1;j<=(n1/2);j++)
			{
				if(n1==(j*(j+1)))
				{
					sum=1;
					break;
				}
			}
			if(sum==1)
				System.out.print(omkar[k]+"\t");	
		}
	}

}
