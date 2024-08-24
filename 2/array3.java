class array3
{
    public static void main()
    {
        int mul[]={7,14,21,28,35,42,49};
        int squ[]=new int[7];
        for(int i=0;i<=6;i++)
        {
            squ[i]=(mul[i]*mul[i]);
        }
        for(int i=6;i>=1;i--)
        {
            System.out.println(squ[i]);
        }
    }
}