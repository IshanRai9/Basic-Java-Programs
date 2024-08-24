
class prg15
{
    boolean year(int y)
  
    {
        if (y%4==0)
        return true;
    else
return false;
   }
   void main (int yy)
   {if (year(yy)==true)
      System.out.println("Leap year");
      if(year(yy)==false)
      System.out.println("not a leap year");
    }
}
        