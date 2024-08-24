class result
{
    int rno,m1,m2,m3;String name;
    void data(int rr, int a, int b, int c, String nm)
    {rno=rr; m1=a; m2=b; m3=c;name=nm;}
    int total()
    {return m1+m2+m3}
    char grade()
    {int tot=total();
        double avg=tot/3;
        char A,B,C;
if (avg/90)
{
    return 'A';}
    else if(avg>60 && avg<=90)
    {
        return'B';}
        else
        {return 'C';
        }
    }

void display()
{
    System.out.println(