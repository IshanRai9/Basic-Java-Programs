
class prg29
{
    int day;
     void weekdays(char day)
    {
        switch(day)
        {
        case '1':
        System.out.println("1-Sunday");
        break;
        case '2':
        System.out.println("2-Monday");
        break;
         case '3':
        System.out.println("3-Tuesday");
        break;
         case '4':
        System.out.println("4-Wednesday");
        break;
         case '5':
        System.out.println("5-Thursday");
        break;
         case '6':
        System.out.println("6-Friday");
        break;
         case '7':
        System.out.println("7-Saturday");
        break;
        default:
        System.out.println("Wrong choice");
        break;
    }
}
    void main()
    {
        weekdays('7');
        weekdays('9');
        weekdays('1');
    }
}
        
        
        