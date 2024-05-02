package array;
import java.util.Scanner;
public class Swap_num_size_even 
{
	public static void main(String[] args) 
	{
		int s,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		s=sc.nextInt();
		if(s%2==0)
		{
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
			System.out.println("\nSwaping number are :");
			for(int i=0;i<s;i=i+2)
			{
				temp=omkar[i];
				omkar[i]=omkar[i+1];
				omkar[i+1]=temp;
			}
			for(int i=0;i<s;i++)
			{
				System.out.print(omkar[i]+"\t");

			}
		}
		else
			System.out.println("Array size is invalid....");
	}

}
