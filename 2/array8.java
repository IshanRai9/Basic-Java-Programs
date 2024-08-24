class array8
{
    public static void main(int x[],int y[])
    {

        
        int z[]=new int[10];
            for(int i=0;i<=4;i++)
            {
              z[i]=x[i];
              z[i+5]=y[i];
            }
             for(int i=0;i<=9;i++)
            {
              System.out.print(z[i]);
            }
            
             
                
            
            
        
    }
}
