//Accept array from user & print strong numbers from array
package array;
import java.util.Scanner;
public class Strong_num 
{
	public static void main(String[] args) 
	{
		int s,n,n1,fact=1,sum=0,sum1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		s=sc.nextInt();
		int omkar[]=new int[s];
		System.out.println("Enter array element");
		for (int i=0;i<s;i++)
		{
			omkar[i]=sc.nextInt();
		}
		System.out.println("Entire element are :");
		for(int j=0;j<s;j++)
		{
			System.out.print(omkar[j]+"\t");
		}
		System.out.println("\nStrong number are :");
		for(int k=0;k<s;k++)
		{
			n=omkar[k];
			
			while(n!=0)
			{
				n1=n%10;
				n=n/10;
				System.out.println("Total of sum ="+(sum1+n1));
				for(int i=1;i<=n1;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				fact=1;

			}
			if(omkar[k]==sum)
			{
				System.out.print(omkar[k]+"\t");
			}
			sum=0;
		}
	}

}
