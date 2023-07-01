import javax.swing. JOptionPane;
public class Brushing
{
    public static void main(String[]args)
    {
       Boolean v=true;
       JOptionPane.showMessageDialog(null,"Izabelle is a virgin "+v,
       "VIRGINITY BEFORE BRUSHING",JOptionPane.PLAIN_MESSAGE);
       JOptionPane.showMessageDialog(null,"BRUSHING...");
       v=false;
        JOptionPane.showMessageDialog(null,"Virginity is "+v,
        "VIRGINITY AFTER BRUSHING",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,
        "Izabelle is no longer a Virgin");

    }
}