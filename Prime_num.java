//Accept array from user & print prime numbers from array
package array;
import java.util.Scanner;
public class Prime_num 
{
	public static void main(String[] args)
	{
		int n,n1,div;
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
		System.out.println("\nprime number are :");
		for(int k=0;k<n;k++)
		{
			n1=omkar[k];
			div=0;
			for(int j=2;j<=(n1/2);j++)
			{
				if(n1%j==0)
				{
					div=1;
					break;
				}
			}
			if(div==0)
				System.out.print(omkar[k]+"\t");
		}
	}
}
