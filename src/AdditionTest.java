import javax.swing.JOptionPane;

public class AdditionTest
{
    public static void main(String[]args)
    {
        Addition a=new Addition(200,300,0);


        JOptionPane.showMessageDialog(null,"initial Sum is "+a.getSum(),
        "INITIAL SUM",JOptionPane.PLAIN_MESSAGE);




            
    }
}