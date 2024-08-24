class  while_6
{
    static void main(int num)
    {
        int rem,rev=0,nnn=num;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(rev== nnn)
        System.out.println("Its a palindrome");
        else
        System.out.println("Not a palindrome");  
    }                                                        
}