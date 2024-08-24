public class funprg1
{
    void square(int nu)//actual variables
    {
        System.out.println("square="+(nu+nu));
    }
    void cube(int nn)
    {int ccc=nn*nn*nn;//local variable and dynamic initialization
    System.out.print("cube"+ccc);}
    void main(int num)
    {square(num);
        cube(num);//calling functions
    }
}


        