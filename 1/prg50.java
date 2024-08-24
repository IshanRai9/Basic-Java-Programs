
class prg50
{
    public static void main(int x)
    {
        int i; int j;int T=0;
        for(i=1,j=2;i<=10;i++,j=j+2)
        T+=(x*i)/j;
        System.out.println(T);
    }
}