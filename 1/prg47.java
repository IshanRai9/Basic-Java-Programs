
class prg47
{
    public static void main(int num)
    {
        int i;int count=0;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            count++;}
            if(count==2)
            System.out.print("Prime number");
            else
            System.out.print("Composite number");
        }
    }
    