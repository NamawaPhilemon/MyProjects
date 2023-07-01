import javax.swing.JOptionPane;

public class AccountTest
{
    public static void main(String[]args)
    {
        Account acc1 = new Account("Juma's ", -500);
        
        JOptionPane.showMessageDialog(null,"Available MPESA balance is: \nksh "
        +acc1.getBalance(),"Initial MPESA balance",JOptionPane.PLAIN_MESSAGE);
      
        
       String depositAmount=
        JOptionPane.showInputDialog("Enter deposit");
       double y = Integer.parseInt(depositAmount);
       acc1.deposit(y);
        JOptionPane.showMessageDialog(null,"new MPESA balance is \nksh "
        + acc1.getBalance() ,"Juma's new balance", JOptionPane.PLAIN_MESSAGE);

        



    }
}