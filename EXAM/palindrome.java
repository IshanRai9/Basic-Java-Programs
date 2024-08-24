class palindrome
 {
    void main (int n)
    {
        int num=n;
        int rem,digit,rev=0;
        do
        {
            digit=n%10;
            rev=(rev*10)+ digit;
            n=10;
        }
        while(n>0);
        if (num==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
           System.out.println("Not Palindrome"); 
        }
    }
}