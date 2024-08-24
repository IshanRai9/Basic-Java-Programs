class Area
    {
        void Area(double r)
        {
           double circle=22/7*r*r;
            System.out.println("Area of circle"+circle);
        }
        void Area(short side)
        {
            int square=side*side;
            System.out.println("Area of square"+square);
        }
        void Area(int len,int wid)
        {
        int rect=len*wid;
        System.out.println("Area of rect"+rect);
    }
}
  
            