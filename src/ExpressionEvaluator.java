import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluator
{
    private final static char PLUS = '+';
    private final static char MINUS = '-';
    private final static char TIMES = '*';
    private final static char DIVIDE = '/';

    private Stack<Integer> stack;

    public ExpressionEvaluator()
    {
        stack= new Stack<Integer>();
    }

 
    public int compute(String expr)
    {
        Integer operand1,operand2,result=0;
        String token;

        Scanner input = new Scanner(expr);

        while (input.hasNext());
        {
            token=input.next();
            if (isOperator(token))
            {
             operand2 = (stack.pop().intValue());
             operand1 = (stack.pop().intValue());
             result = evaluateSingleOperator(token.charAt(0),operand1,operand2);
             stack.push(result);
             System.out.println(result);
            }
         else
          {
           System.out.println(token);
           stack.push(Integer.parseInt(token));
          }
        }
       input.close();
       return result;
    }
  private boolean isOperator(String token)
 {
    Character z = token.charAt(0);
    if (token.length()>1)
    {
      return false;
    }
    return (z.equals(PLUS)||z.equals(MINUS)||z.equals(TIMES)||z.equals(DIVIDE));
 }
 private int evaluateSingleOperator(char operator, int op1, int op2 )
 {
    int result=0;

    switch (operator)
    {
        case PLUS:
        result = op1+op2;
        break;

        case MINUS:
        result = op1-op2;
        break;

        case TIMES:
        result = op1*op2;
        break;

        case DIVIDE:
        result = op1/op2;
        break;
    }
    return result;
   }
}