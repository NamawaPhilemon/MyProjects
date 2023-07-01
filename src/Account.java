import javax.swing.JOptionPane;
public class Account
{
    private String name ;// class's instance variables
    private double balance;// account class's instance variable

//CONSTRUCTOR
    // double bal - is the initialization done by Account constructor. therefore "double bal" is the initial vale
    public Account(String name, double bal)
    {
        this.name =name;
// if the bal(initial) value is valid then that value is assigned to the instance 
// variable balance
        if (bal<0.0)
        JOptionPane.showConfirmDialog(null,"Repay MPESA Loan","CONFIRMATION", 0);
     balance = bal;
        if(bal>=0)
     JOptionPane.showConfirmDialog(null,"You do not have \n Any MPESA Loan topay","CONFIRMATION", 0);
     balance = bal;
    }
    public void deposit(double dep)
    {
        if(dep<0.0)
        JOptionPane.showConfirmDialog(null,
        "Invalid deposit  ","CONFIRMATION", 0);
        if (dep>0.0)
        balance = balance + dep;
        if (balance+dep>=0) 
        JOptionPane.showConfirmDialog(null,
        "You have successfuly repayed\n Your MPESA Loan ","CONFIRMATION", 0);
     
    }

    
    public double getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String nm)
    {
        name = nm;
    }
}// End class account


