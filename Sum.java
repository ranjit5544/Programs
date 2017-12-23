import java.util.*;

class Sum
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int sz=sc.nextInt();
		int num[]=new int[sz];
		for(int i=0;i<sz;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<sz;i++)
		{
			int sum=0;
			while(num[i]>0)
			{
				sum=sum+(num[i]%10);
				num[i]=num[i]/10;
			}
			System.out.println(sum);
		}
	}
}