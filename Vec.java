import java.io.*;
import java.util.*;
 
class Vec
{
	static String printColX(int col, String tree)
	{
		char temp[]=tree.toCharArray();
		String res="";
		int sz=tree.length();
		String arr[][]=new String[2][sz];
		//try{
			arr[0][0]=Character.toString(temp[0]);
			arr[1][0]="0";
			int count=0;
			String prev="";
			for(int i=1;i<tree.length();i++)
			{
				String t=Character.toString(temp[i]);
				if(t.equals("("))
				{
					count++;
					arr[0][i]=Character.toString(temp[i]);
					arr[1][i]=Integer.toString(1000);
				}
				else if(t.equals("."))
				{
					if(prev.equals("."))
					{
						prev=t;
						continue;
					}
					count--;
					arr[0][i]=Character.toString(temp[i]);
					arr[1][i]=Integer.toString(1000);
				}				
				else if(t.equals(")"))
				{
					count--;
					arr[0][i]=Character.toString(temp[i]);
					arr[1][i]=Integer.toString(1000);
				}							
				else
				{
					arr[0][i]=Character.toString(temp[i]);
					arr[1][i]=Integer.toString(count);
				}
				prev=t;						
			}
			for(int i=0;i<sz;i++)
			{
				System.out.println(arr[1][i]);
				int comp=Integer.parseInt(arr[1][i]);
				if(comp==col)
				{
					res=res+arr[0][i];
				}
			}
			if(res.equals(""))
			{
				return "Hallelujah!";
			}
			return res;
		//}
		//catch(Exception e)
		//{
		//	System.out.println(e);
		//}
		//return res;
	}
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testNo=Integer.parseInt(br.readLine());
		String out[]=new String[testNo];
		for(int i=0;i<testNo;i++)
		{
			int col=Integer.parseInt(br.readLine());
			String iTree=br.readLine();
			out[i]=printColX(col,iTree);
		}
		
		for(int i=0;i<testNo;i++)
		{
			System.out.println(out[i]);
		}
	}
}