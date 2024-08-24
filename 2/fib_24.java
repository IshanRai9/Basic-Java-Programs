public class fib_24
{
    void main()
    {
        int i,sum=0;
        for(i=2;i<=20;i+=2)
        {
            if(i%4==0)
            sum-=i;
            else
            sum+=i;
        }
        System.out.print(sum);
    }
}