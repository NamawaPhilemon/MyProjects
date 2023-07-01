public class Addition
{
    
    private int number1;
    private int number2;
    private int sum;

    public Addition(int num1,int num2,int sum)
    {
        number1=num1;
        number2 = num2;
        this.sum = number1 + number2;
    }
    public int getSum()
    {
        return sum;
    }
    public void setNumber1(int num1)
    {
        number1=num1;
    }
    public int getNumber1()
    {
        return number1;
    }

    public void setNumber(int num2) 
        {
            number2 = num2;
        }
    public int getNumber2()
    {
        return number2;
    }
}