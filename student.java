package array;
import java.util.*;
public class student 
{
	int rno;
	String sname;
	double per;
	
	void accept()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter roll no,name&percentage");
		rno=sc.nextInt();
		sname =sc.next();
		per=sc.nextDouble();
	}
	void display()
	{
		System.out.println(" roll no ="+rno);
		System.out.println(" name ="+sname);
		System.out.println(" percentage ="+per);
		
	}

	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no of student");
		n=sc.nextInt();
		student s1[]=new student[n];
		for (i=0;i<=n;i++)
		{
			s1[i]= new student();
			s1[i].accept();
			s1[i].display();
			System.out.println(" omkar ");
		}

	}

}
