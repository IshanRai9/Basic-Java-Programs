
class prg38
{
    public static void main()
    {
        int a;int i;int sum=0;
        for(i=6;i>=1;i--)
        {
            a=i*i-1;
            sum+=a;
            System.out.print(a+"\t");
        }
        System.out.println("sum="+sum);
    }
}