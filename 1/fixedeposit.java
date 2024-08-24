
class fixedeposit
{
    int calculate(int t)
    {
        if(t<=1)
         return 7;
        else if(1<t &&t<3)
        return 9;
        else if(3<=t&& t<5)
        return 10;
        else
        return 11;
    }
    void amount(int p, int t)
   { int r=calculate(t);
    double SI=(p*r*t)/100;
    double Amount=SI+p;
    System.out.println("amount to be said"+Amount);
}
}

    