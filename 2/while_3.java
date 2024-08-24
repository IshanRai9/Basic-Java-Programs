class while_3
{
    static void main(int num)
    {
        int rem,quo,c=0;
        while(num>0)
        {
            rem=num%10;
            if(rem==0)
            {
                c++;
            }
            quo=num/10;
            num=quo;
        }
        if(c!=0)
        System.out.println("Its a duck number");
        else
        System.out.println("Its not a duck number");
    }
} 