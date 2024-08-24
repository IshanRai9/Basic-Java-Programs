
class prg24
{
    void main(int num1, int num2, char operator)
    {
        switch(operator)
        {
            case '+':
            System.out.println(num1+num2);
            break;
            case '*':
            System.out.println(num1*num2);
            break;
            case '/':
            System.out.println(num1/num2);
            break;
            case '-':
            System.out.println(num1-num2);
            break;
            default:
            System.out.println("wrong choice");
        }
    }
}