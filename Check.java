class Check1
{
    int demo(int fact)
    {
        int res=1;
        while(fact>0)
        {
            res*=fact;
            fact--;
            demo(fact);
        }
        return res;
    }
}
class Check
{
    public static void main(String[] a)
    {
        Check1 c=new Check1();
        int res=c.demo(5);
        System.out.println(res);
    }
}