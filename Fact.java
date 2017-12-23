import java.util.*;

class Fact
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int sz=sc.nextInt();
		int num[]=new int[sz];
		for(int i=0;i<sz;i++)
		{
			int num1=sc.nextInt();
			int sum=1;
			for(int j=1;j<=num1;j++)
			{
				sum=sum*j;
			}
			num[i]=sum;
		}
		System.out.println();
		for(int i=0;i<sz;i++)
		{
			System.out.println(num[i]);
		}
	}
}