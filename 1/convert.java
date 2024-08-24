class convert
{
    int temp;
    char ch;
    void setdata(int temp, char ch)
    { this.temp=temp; this.ch=ch;}
    int fe()
    {return 9/5*(temp)+32;}
    int c()
    {return (temp-32)*5/9;}
    void main()
    {
        if (ch=='f')
        System.out.println(fe());
      else  if (ch=='c')
        System.out.println(c());
        else
        System.out.println("none of the above");
    }
}
    
