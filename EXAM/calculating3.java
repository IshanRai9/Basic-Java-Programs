class calculating3
{
    void calculate(int n)
    {
        for(int i=3;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }

    void calculate(int x,int y)
    {
        if(x<=0)
        {
            System.out.print("Zero is not a natural number");
        }
        else if(y<=x);
        {
            System.out.print("Invalid");
        }
        for(int i=x;i<=y;i++)
        { 
            System.out.print(i+" ");
        }
    }

    void calculate()
    {
        for(int i=5;i<=50;i=i+5)
        {
            System.out.print(i+" ");
        }
    }
}

