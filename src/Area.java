import javax.swing.JOptionPane;
public class Area
{
  public static void main(String[] args)
  {
    double pi = 3.142;
     String radius =
 JOptionPane.showInputDialog("Enter radius");
 
 int r = Integer.parseInt(radius);
 
  double area = r*r*pi;
 // display result in a JOptionPane message dialog
 JOptionPane.showMessageDialog(null, "The Area is " + area,
 "AREA OF A CIRCLE", JOptionPane.PLAIN_MESSAGE);
  }
}