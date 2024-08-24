class prime
{
    static void main(int num)
    {
        int i,count=0;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            count++;
        }
        if(count==2)
        System.out.print("prime no");
        else
        System.out.print(" Not a prime no");
    }

      void check_prime(int n) 
     {
         int a;
        for(a=1;a<=n;a++)
        {
           System.out.print(a);
        }
      }
}