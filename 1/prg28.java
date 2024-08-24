
class prg28
{
    public static void main(int num, String choice )
    {
        switch(choice)
        {
            case "square":
            System.out.println(num*num);
            break;
            case "cube":
            System.out.println(num*num*num);
            break;
        default:
        System.out.println("wrong choice");
    }
}
}
