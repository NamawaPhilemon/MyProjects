import javax.swing.JOptionPane;

public class Comparison
{
    public static void main(String[] args)
{
        String number1=
       JOptionPane.showInputDialog(null, "Enter the first number");
       int num1=Integer.parseInt(number1);
       String number2=
        JOptionPane.showInputDialog(null, "Enter the Second number");
        int num2=Integer.parseInt(number2);

        if(num1==num2)
       JOptionPane.showMessageDialog(null,"number1 is=Number2");
        if(num1>=num2)
        JOptionPane.showMessageDialog(null,"number1 is greater than or equal to number2");
        if(num1<=num2)
        JOptionPane.showMessageDialog(null,"number1 is <= number2");
    }
}
    