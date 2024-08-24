 
class prg39
{
    public static void main()
    {
        int i;int sum=0;int pro=1;
        for(i=15;i<34;i++)
        {
            if(i%2==0)
            sum+=i;
            else if(i%2!=0&&i%3==0)
            pro*=i;
            System.out.println(i);
        }
        System.out.println("Sum="+sum);
        System.out.println("Product="+pro);
    }
}