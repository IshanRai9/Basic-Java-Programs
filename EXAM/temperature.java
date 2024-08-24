class temperature
{
    void main (int t,string c)
    {
        switch (c)
        {
            case "Choice 1":
            int x=5/9*(t-32);
            System.out.println(x+"degree celsius");
            return;
            case "Choice 2":
            int y=1.8*(t+32);
            System.out.println(y+"degree fahrenheit");
            return;
            default:
            System.out.println("Inappropiate choice");
            return;
        }
    }
}
           