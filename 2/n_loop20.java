class n_loop20
{
    void main()
    {
        for(char i='a';i<='g';i+=2)//rows
        {
            for(char j=i;j<='g';j+=2)//cols
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}