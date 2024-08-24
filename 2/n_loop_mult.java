class n_loop_mult
{
    void main()
    {
        for(int i=2;i<=40;i+=2)//rows
        {
            for(int j=1;j<=10;j++)//cols
            {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
}