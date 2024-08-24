
class prg21
{
    
    String name;
    int previous;
    int present;
   
       void getdata(int pr, int pre,String nm)
       {name=nm;previous=pr;present=pre;}
       double units()
       {
           int unt=present-previous; double netchr;
           if(unt>=1&&unt<=100)
           netchr=unt*.40;
           else if(unt>100&&unt<=200)
           netchr=(100*.40)+((unt-100)*.60);
           else
           netchr=(100*.40)+((100*.60)+(unt-200)*1);
           return netchr;}
           void main()
           {
               double chr=units();
               System.out.print(name + "charges are" +(chr+250));
            }
        }