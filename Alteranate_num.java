//Accept array from user & print alteranate element
package array;
import java.util.Scanner;
public class Alteranate_num
{
	public static void main(String[] args) 
	{
		int s;
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
		System.out.println("\nAlternate number are :");
		for(int i=0;i<s;i=i+2)
		{
			System.out.print(omkar[i]+"\t");
		}
	}

}
