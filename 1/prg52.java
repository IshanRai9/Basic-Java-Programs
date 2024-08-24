
class prg52
{
    public static void main()
    {
        int i;int sum=0;
        for(i=2;i<=20;i=i+2)
       {
           if(i%4==0)
           sum-=i;
           else
           sum+=i;

}
System.out.println(sum);
}
}