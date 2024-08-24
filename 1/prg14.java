
class prg14
{
    int num, num2;
    char ch;
    void setdata(char c, int nu, int nu2)
    {
        this.ch=c;
        this.num=nu;
        this.num2=nu2;
    }
    int quo()
    { return num/num2;}
    int rem()
    { return num%num2;}
void main()
{
    if (ch=='1')
    System.out.print(quo());
    if (ch=='2')
    System.out.print(rem());
}
}