import java.util.Scanner;

public class ExpressionEvaluatorTest
{
    public static void main (String args[])
    {
        String expression,again;
        int result;
        
        Scanner in = new Scanner(System.in);

        do
        {
            ExpressionEvaluator computer= new ExpressionEvaluator();
            System.out.print("Enter a Valid expression\n");
            expression = in.nextLine();

            result = computer.compute(expression);
            System.out.println();
            System.out.print("the expression="+result);

            System.out.print("Do you want to Enter another expression?[Yes/No]");
            again=in.nextLine();
            System.out.println();
        }
        while(again.equalsIgnoreCase("Yes"));
        in.close();
    }
}