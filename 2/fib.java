class fib
{
static void main()
  {
    int a=0,b=1,c,i;
    System.out.print(a+" "+b+" ");
    for(i=1;i<=8;i++)
    {
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
  }
}