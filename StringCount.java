import java.io.*;
import java.util.*;

class StringCount
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens())
        {
            String s=st.nextToken();
            System.out.print(s+s.length()+" ");
        }
    }
}