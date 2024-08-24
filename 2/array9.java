class array9
{
    public static void main(int n[])
    {
       int sum=0,pro=1,ave=0;
       for(int i=0;i<n.length;i++)
       {
         sum=n[i]+ sum;
         pro=n[i]*pro;
         ave=sum/n.length;     
       }
       System.out.println("sum="+sum);
       System.out.println("average="+ave);
       System.out.println("product="+pro);
    }
}
