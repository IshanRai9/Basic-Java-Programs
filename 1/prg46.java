class prg46
{
    public static void main(int num)
    {
        int i,sum=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            sum=sum+i;
        }
        if(sum==num)
        System.out.print("Perfect no");
        else
        System.out.print("No");
    }
}
