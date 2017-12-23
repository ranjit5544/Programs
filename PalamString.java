import java.io.*;
import java.util.*;

class PalamString
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens())
        {
            char arr[]=(st.nextToken()).toCharArray();
            int len=arr.length;
            if(len%2 != 0)
            {
                for(int i=0, j=len-1;i<len/2,j>len/2;i++,j--)
                {

                }
            }
        }
    }
}