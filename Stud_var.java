package array;
import java.util.*;
class Maximum
{
	int a,b;
	void accept(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	String display()
	{
		if(a>b)
		{
			return "first number is greater than second";
			
		}
		else if(a<b)
		{
		   return "second is greater than first";	
		}
		else 
		{
			return "both are equals";
		}
	}
	
}

public class Stud_var
{
	public static void main(String[] args)
	{
		
	    int a,b,i,n=500;
	    Scanner shubham=new Scanner (System.in);
	    System.out.println("enter first number");
	    a=shubham.nextInt();
	    System.out.println("enter the second number");
	    b=shubham.nextInt();
	    Maximum m1[]=new Maximum[n];
	    for(i=0;i<=n;i++)
	    {
	    	 m1[i].accept(a,b);
	 	    String s1=m1[i].display();
	 	    System.out.println(" "+m1[i].display());
	 	 }
	 	}
    }
