public class transport
{
    double value(int kg)
    {int chr;
        if(kg>=10 && kg<=10)
        chr=kg*30;
        else
        if(kg>10 && kg<=30)
        chr= (10*30)+((kg-10)*20);
        else
        chr=(10*30)+(10*20)-((kg-20)*15);
        return chr;}
}
        
 