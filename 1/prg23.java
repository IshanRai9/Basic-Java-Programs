
class prg23
{
    int h;int r;int w;
    void main(int r , int h)
    {
       
        if(h<=35&&h>=1)
       { w=h*r;
       System.out.println(w);}
        
        else if(h>35 && h<=60)
        {w=(35*r)+(h-35)*(r*(15/10));;
        System.out.println(w);}
        else if(h>60 && h<=70)
        {w=(35*r)+(25*(15/10)*r)+(h-60)*2*r;
        System.out.println(w);
    }
}
}