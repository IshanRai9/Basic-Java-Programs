class prg53
{
    public static void main(int n)
    {
        int i,sum=0;
        for( i=1;i<=n;i++)
        {
            if(i%2==0)
            sum-=i;
            else
            sum+=i;
        }
        System.out.println(sum);
        
    }
}