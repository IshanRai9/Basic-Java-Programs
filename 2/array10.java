class array10
{
    public static void main(int n[])
    {
        int small=n[0],large=n[0],loc=0,i,loca=0;       
        for( i=0;i<n.length;i++)
        {               
            if(n[i]<small)               
            {                  
               small=n[i];
               loc=i;
            }
            else
            {               
                large=n[i];
                loca=i;
            }
            System.out.println(small+"  "+loc+
            large+"  "+loca);    
        }
    }
}


