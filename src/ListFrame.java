import java.awt. FlowLayout;
import java.awt. Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class ListFrame extends JFrame
{
    private final JList<String> colorList1;
    private static final String[] colorNames={"Black","red","green","Blue"};
    private static final Color[] colors={Color.BLACK,Color.RED,Color.GREEN,Color.BLUE};
    private final JButton btn1;

    public ListFrame ()
    {
        super("COLOR LIST FRAME");
        setLayout(new FlowLayout(70));


        colorList1 = new JList<String>(colorNames);
        colorList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        colorList1.setVisible(false);
        colorList1.setVisibleRowCount(3);

        JScrollPane pn1 = new JScrollPane(colorList1);
        add(pn1);

        colorList1.addListSelectionListener(
            new ListSelectionListener() 
            {
                @Override
                public void valueChanged(ListSelectionEvent event)
                {
                    getContentPane().setBackground(colors[colorList1.getSelectedIndex()]);
                }
            }
        );
        
        btn1=new JButton("Colors");
        add(btn1);
        btn1.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    colorList1.setVisible(true); 
                    pn1.setVisible(true);
                }
            }
        );
         JButton btn2 = new JButton("Ok");
         add(btn2);
         btn2.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    colorList1.setVisible(false); 
                    pn1.setVisible(false);
                }
            }
         );
    }
}
