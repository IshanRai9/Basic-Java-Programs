
class prg27
{
    public static void main(int radius, int length, int breadth, String area)
    {
        switch(area)
        {
            case "circle":
            System.out.println(22/7*radius*radius);
            break;
            case "rectangle":
            System.out.println(length*breadth);
            break;
            case "square":
            System.out.println(length*length);
            break;
            default:
            System.out.println("wrong choice");
        }
    }
}