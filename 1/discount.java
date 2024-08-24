
class discount
{
    double cost;double totaldisc;
    void getdata(double cost)
    {this.cost=cost; totaldisc=totaldisc;}
    double amount()
    {double totalcost;
        
        if(cost<=2000 && cost>=1)
        {
            totaldisc=(25*cost/100);
        totalcost=cost-totaldisc;}
        else if(cost>=2001 && cost<=5000)
       { totaldisc=(25*cost/100);
        totalcost=cost-totaldisc;}
        else if(cost>=5001 && cost<=10000)
       { totaldisc=(35*cost/100);
        totalcost=cost-totaldisc;}
        else
       { totaldisc=(50*cost/100);
        totalcost=cost-totaldisc;}
        return totalcost;}
        void main()
   { double chr=amount();
    System.out.println("name"+"amount="+chr);
}
}