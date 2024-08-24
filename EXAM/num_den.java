class num_den
{
    void main(int n)
    {
        int num=n;
        int den;
        int term;
        int sum=0;
        int i;
        for(i=1;i<=20;i++)
        {
            den=i;
            term=num/den;
            sum+=term;
        }
        System.out.println("sum is "+sum);
    }
}
        