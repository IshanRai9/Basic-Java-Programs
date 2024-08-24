class array5
{
    public static void main()
    {

        int a[]={5,10,15,20,25,30,35,40,45,50,55,60,75,80,95};
        int b[]={1,4,9,16,25,36,49,64,81,100,121,144,169,196,225};
        int c[]=new int[15];
            for(int i=0;i<=14;i++)
            {
              c[i]=a[i]+b[i];
                System.out.println(c[i]);
            
            
        
    }
}
}