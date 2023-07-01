import javax.swing.JOptionPane;
public class StudentTest
{
    public static void main(String[]args)
    {
        Student stud1= new Student("Juma Philemon", 80);
        Student stud2= new Student("Joshua Indimuli", 70);
        Student stud3= new Student("John Alukaya", 40);
        Student stud4= new Student("Ruth Kaita", 90);

        JOptionPane.showMessageDialog(null,"Average is: "
        +stud1.getAverage(),"Juma Namawa",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Grade is: "
        +stud1.getGrade(),"Juma Namawa",JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,"Average is: "
        +stud2.getAverage(),"Joshua Indimuli",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Grade is: "
        +stud2.getGrade(),"Joshua Indimuli",JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,"Average is: "
        +stud3.getAverage(),"John Alukaya",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Grade is: "
        +stud3.getGrade(),"John Alukaya",JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,"Average is: "
        +stud4.getAverage(),"Ruth Kaita",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Grade is: "
        +stud4.getGrade(),"Ruth Kaita",JOptionPane.PLAIN_MESSAGE);

        

    }
}
  