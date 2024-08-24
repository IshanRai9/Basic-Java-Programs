class while_11
{
    int i=1,b=8;
    void res_3()
    {
        while(i<6)
        {
            System.out.print((i%2==0)?i+" ":"\nno");
            i++;
        }
        System.out.println(b<i || i<10);
    }
}
