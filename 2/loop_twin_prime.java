public class loop_twin_prime
{
    static void main(int num1,int num2)
    {
        int i,con=0,coun=0;
        for(i=1;i<=num1;i++)
        {
            if(num1%i==0)
            con++;
        }
        for(i=1;i<=num2;i++)
        {
         if (num2%i==0)
         coun++;
        }
        if(con==2&&coun==2&&(num2-num1)==2)
         System.out.print("Twin prime");else System.out.print("Not"); 
    }
}