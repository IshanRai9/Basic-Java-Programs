class HCF_LCM
{
    void main (int a,int b)
    {
        int HCF=0,LCM=0,i,j;
        for (i=1;i<=a;i++)
        {
            if (a%i==0 && b%i==0)
            {LCM=i;}
         }
         for (j=1;j<=a;j++)
         {
             if(a%i==0 && b%i==0)
             {HCF=i;}
          }
          System.out.println("HCF is "+LCM);
          System.out.println("LCM is "+((a*b)/LCM));
        }
    }