
class prg45
{
    public static void main(int n,int m)
    {
        int hcf=0;int i;
        for(i=1;i<n;i++)
        {
            if(n%i==0&&m%i==0)
            hcf=i;
        }
       System.out.println("hcf="+hcf);
       System.out.println("lcm="+((n*m)/hcf));
       
    }
}