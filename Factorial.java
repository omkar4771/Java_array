package array;
public class Factorial 
{
	public static void main(String[] args)
	{
		int n=145,n1,fact=1,sum=0;
		int f=n;
		while(n!=0)
		{
			n1=n%10;
			n=n/10;
			for(int i=1;i<=n1;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
			System.out.println(sum);
		}
		if(sum==f)
		{
			System.out.println("Strong num");
		}
	}
}
