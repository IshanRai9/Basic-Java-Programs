
class prg22
{
    int kg;
   double value(int kg)
  {int chr;
      if(kg<=10&&kg>=1)
      chr=kg*30;
      else if(kg>10&& kg<=20)
      chr=(10*30)+((kg-10)*20);
      else
      chr=(10*30)+(10*20)-((kg-20)*15);
    return chr;}
    
}