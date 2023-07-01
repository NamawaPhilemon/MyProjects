import javax.swing.JOptionPane;

public class ClassAverage
{
    public static void main(String[]args)
    {
        int total = 0;
        int counter = 1;

        JOptionPane.showMessageDialog(null,"Enter Marks for 10 Students");
        while (counter <=10)
        {
            String grade=
            JOptionPane.showInputDialog("Enter grade");
            int g =Integer.parseInt(grade);
            total = total + g;
            counter =counter+1;
        }
        int average = total/10;

        JOptionPane.showMessageDialog(null,"Total Grade is: "+ total,
         "TOTAL CLASS GRADE",JOptionPane.PLAIN_MESSAGE);
         JOptionPane.showMessageDialog(null,"Average Grade is: "+ average,
         "TOTAL CLASS AVERAGE",JOptionPane.PLAIN_MESSAGE);
    }
}