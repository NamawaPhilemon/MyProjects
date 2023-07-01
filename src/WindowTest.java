import javax.swing.JFrame;

public class WindowTest
{
    public static void main(String[]args)
    {
    Window w = new Window();
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setSize(500,600);
    w.setVisible(true);
    
    }
}

