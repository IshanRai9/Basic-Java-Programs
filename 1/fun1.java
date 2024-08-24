
public class fun1
{int side,rad;
    void input(int s, int r)
    {side=s;
        rad=r;}
        
        void Areacircle()
        {
            System.out.println("Area circle="+(3.14*rad*rad));
        }
        void Areasquare()
        {
            int cu=side*side;
            System.out.println("Area square="+cu);
        }
        void main()
        {Areacircle();
            Areasquare();//calling functions
        }
    }