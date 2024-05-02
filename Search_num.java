package array;

import java.util.Scanner;

public class Search_num 
{

	public static void main(String[] args) 
	{
		int s,n,counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		s=sc.nextInt();
		int omkar[]=new int[s];
		System.out.println("Enter array element");
		for (int i=0;i<s;i++)
		{
			omkar[i]=sc.nextInt();
		}
		System.out.println("Enter searching element");
		n=sc.nextInt();
		System.out.println("Entire element are :");
		for(int j=0;j<s;j++)
		{
			System.out.print(omkar[j]+"\t");
		}
		for(int i=0;i<s;i++)
		{
			if(n==omkar[i])
			{
				counter=1;
				System.out.println("\nElement fount at "+(i+1)+" position");
				break;
			}
		}
		if(counter==0)
		{
			System.out.println("\nElement not fount");
		}
		
	}

}
