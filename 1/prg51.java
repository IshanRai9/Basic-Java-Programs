class prg51
{
   int fact(int ff)
   {
       int fact=1;
       for(int i=1;i<=ff;i++)
       fact*=i;
       return fact;
    }
    void main(int n)
    {
        int i,sum=0;
        for( i=2;i<=n;i++)
        sum+=fact(i)/5;
        System.out.print("sum="+sum);
    }
}
