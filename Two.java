import java.util.*;

class Two
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int sz=sc.nextInt();
		int num[]=new int[sz];
		for(int i=0;i<sz;i++)
		{
			int num1,num2;
			num1=sc.nextInt();
			num2=sc.nextInt();
			num[i]=num1+num2;
		}
		for(int i=0;i<sz;i++)
		{
			System.out.println(num[i]);
		}
	}
}