package array;
import java.util.*;
public class SecondSmaller 
{
	public static void main(String[] args) 
	{
		int i,j,k,temp,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of element");
		n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the element");
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(j=0;j<n;j++)
		{
			for(k=j+1;k>n;k++)
			{
				if(array[j]>array[k])
				{
					temp=array[j];
					array[j]=array[k];
					array[k]=array[j];
				}
			}
		}
		System.out.println("Second Smallest element ="+array[1]);
	}

}
