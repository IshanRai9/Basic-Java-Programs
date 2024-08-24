public class discount
{
    double amount(double cost)
    {double amt=0;
        if(cost<=2000)
        amt=cost-cost*15/100;
        else
        if(cost>2001 && cost<=5000)
        amt=cost-cost*20/100;
        else
        if(cost>5001 && cost<=10000)
        amt=cost-cost*30/100;
        else
         amt=cost-cost*50/100;
        return amt;
    }
}