import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JTextField;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


public class Window extends JFrame
{
   private final JLabel label1;
   private final JLabel label2;

   private final JButton button1;
   
   private final JButton button2;
   private final JButton button3;
   private final JButton button4;

   private final FlowLayout layout;
   private final Container container; 

   private final JButton button5;
   
   private final JTextField fld1;
   private final JTextField fld2;
   private final JRadioButton rb1;
   private final JRadioButton rb2;

   private final JCheckBox cb1;
   private final JCheckBox cb2;

   private final JComboBox<String> namesComboBox;
   private final String[] names = {"Juma Philemon", "Joshua Indimuli","John Alukaya", "Ruth Kaita"};

   public Window()
   {
    super("PHILEMON JUMA NAMAWA");
    
    layout = new FlowLayout();
    container = getContentPane();
    setLayout(layout);
 
    

    label1 = new JLabel("EVENT driven Programming.\n");
    label2 = new JLabel("\nClick buttons to generate Events\n");

    add(label1);
    add(label2);

    button1 = new JButton("Addition");
    add(button1);

    ButtonHandler handler = new ButtonHandler(); 
    button1.addActionListener(handler);

    button2 = new JButton("Left");
    add(button2);
    button2.addActionListener( 
    new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            layout.setAlignment(FlowLayout.LEFT);
            layout.layoutContainer(container);
        }
    }
    );
    button3 = new JButton("Right");
    add(button3);
    button3.addActionListener( 
    new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            layout.setAlignment(FlowLayout.RIGHT);
            layout.layoutContainer(container);
        }
    }
    );
    button4 = new JButton("Center");
    add(button4);
    button4.addActionListener( 
    new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            layout.setAlignment(FlowLayout.CENTER);
            layout.layoutContainer(container);
        }
    }
    );
    
    button5 = new JButton("SUM");
    add(button5,BorderLayout.SOUTH);

  fld1 = new JTextField("Namawa Philemon");
  fld1.setFont(new Font("TimesNewRoman",Font.PLAIN,22));
  add(fld1);

  cb1 = new JCheckBox("Bold");
  cb2 = new JCheckBox("Italic");
  add(cb1);
  add(cb2);

  namesComboBox =new JComboBox<String>(names);

  add(namesComboBox);

  //registering listeners for cb1 and cb2
CheckBoxHandler h = new CheckBoxHandler();
cb1.addItemListener(h);
cb2.addItemListener(h);

fld2 = new JTextField("Write Your Name Here",30);
add(fld2,BorderLayout.SOUTH);
rb1 = new JRadioButton("Male",false);
add(rb1);

rb1.addItemListener(
    new ItemListener()
    {
        @Override
        public void itemStateChanged(ItemEvent event)
        {
            Font f;
            f= new Font("Serif",Font.BOLD+Font.ITALIC,14);
            fld2.setFont(f);
        }
    }
);
rb2 = new JRadioButton("Female",false);
add(rb2);

rb2.addItemListener(
    new ItemListener()
    {
        
        @Override
        public void itemStateChanged(ItemEvent event)
        {
            Font f;
            f= new Font("Arial Black",Font.BOLD+Font.ITALIC,22);
            fld2.setFont(f);


        }
    }
);


   }
   private class ButtonHandler implements ActionListener
   {
    @Override
    public void actionPerformed(ActionEvent event)
    {
        String y=
        JOptionPane.showInputDialog("Enter First Integer");
        double y1 = Integer.parseInt(y);
        String x=
        JOptionPane.showInputDialog("Enter Second Integer");
        double y2 = Integer.parseInt(x);
        JOptionPane.showMessageDialog(null,
        "Click on the Sum button \nto obtain Sum");
        
        button5.addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                double sum = y1 + y2;
                JOptionPane.showMessageDialog(null,
                "Sum is: " + sum); 
            }
        }
    );
        
    }
   }
   private class CheckBoxHandler implements ItemListener
   {
    @Override
      public void itemStateChanged(ItemEvent event)
      {
        Font f=null;
        if(cb1.isSelected() && cb2.isSelected())
        f=new Font("SanSerif",Font.BOLD+Font.ITALIC,22);
        else if(cb1.isSelected())
        f=new Font("Arial",Font.BOLD,22);
        else if(cb2.isSelected())
        f=new Font("SanSerif",Font.ITALIC,22);
        else 
        f = new Font("Arial",Font.PLAIN,14);
        fld1.setFont(f);
      }
   }
   
  

}