package array;
import java.util.Scanner;
public class Magic_num 
{
	public static void main(String[] args)
	{
		int s,n,n1,n2,n3,n4,sum=0,sum1=0;
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
		System.out.println("\nMagic number are :");
		for(int i=0;i<s;i++)
		{
			n=omkar[i];
			while(n!=0)
			{
				n1=n%10;
				n=n/10;
				
				sum=sum+n1;
			}
			n4=sum;
			while(sum!=0)
			{
				n2=sum%10;
				sum=sum/10;
				
				sum1=(sum1*10)+n2;
			}
			n3=n4*sum1;
			if(omkar[i]==n3)
			{
				System.out.println(omkar[i]+"\t");
			}
			sum=0;
			sum1=0;
			//1729 is magic number
			/* 1729 ----->1)
			 * 1+7+2+9 =19--->2)
			 * reverse of 19=91---->3)
			 * 19*91=1729---->4)
			 * if(Eq(1)==Eq(4))
			 * {
			 * 	the number is magic
			 * }
			 */

		}
	}

}
