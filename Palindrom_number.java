//Accept array from user & print palindrom numbers from array
package array;
import java.util.Scanner;
public class Palindrom_number
{
	public static void main(String[] args) 
	{
		int n,n1,sum,a;
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
		System.out.println("\nPalindrome number are :");
		for(int k=0;k<n;k++)
		{
			n1=omkar[k];
			sum=0;
			while(n1>0)
			{
				a=n1%10;
				n1=n1/10;
				sum=(sum*10)+a;
			}
			if(sum==omkar[k])
			{
				System.out.print(omkar[k]+"\t");
			}
		}
	}

}
