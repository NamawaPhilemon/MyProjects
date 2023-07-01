import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Field extends JFrame
{
    private final JLabel lb2;
    private final JLabel lb3;
    private final JTextField fld2;
    private final JTextField fld3;


    public Field()
    {
        super("AGE CALCULATOR");
        setLayout(new FlowLayout());
        
       
        lb2 = new JLabel("Enter current Year");
        fld2 = new JTextField("type here",20);

        add(lb2);
        add(fld2);
       
        lb3 = new JLabel("Enter  Year of Birth");
        fld3 = new JTextField("type here",20);
        add(lb3);
        add(fld3);
        

        FieldHandler handler = new FieldHandler();
        fld2.addActionListener(handler);
        fld3.addActionListener(handler);
       

    }
    private class FieldHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String y = "";
            if(event.getSource()==fld2)
            y=String.format("current year is:%s",event.getActionCommand());
           
            if(event.getSource()==fld3)
            y=String.format("Year of birth is:%s",event.getActionCommand()); 
            JOptionPane.showMessageDialog(null,y);
           
           
 
             
        }
        
    }
    

}
