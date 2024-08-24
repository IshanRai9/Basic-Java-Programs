class  while_5
{
    static void main(int num)
    {
        int rem,quo,a=num,sum=0,pro=1,spe;
        while(num>0)
        {
            rem=num%10;
            quo=num/10;
            num=quo;
            sum+=num;
            pro*=pro;
        }
        
        spe=pro+sum;
        
        if(spe==a)
        
        System.out.println("special two digit number");
        else
        System.out.println("Not a special two digit number");  
    }
}