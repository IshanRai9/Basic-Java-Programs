class prg48
{
   public static void main(int num1,int num2)
   {
       int i;int count=0;int dif;int coun=0;
       for(i=1;i<=num1;i++)
       {
           if(num1%i==0)
           count++;}
        for(i=1;i<=num2;i++)
       {
           if(num2%i==0)
           coun++;}
           dif=num1-num2;
           if(count==2&&coun==2&&dif==-2||dif==2)
           System.out.println("Twin prime");
           else
           System.out.println("No");
        }
    }
           