public class Student
{
    private String name;
    private double average;

    public Student(String name, double average)
    {
       this.name=name;
       this.average=average;
       if (average>0.0)
        if(average <=100)
          this.average=average;
    }
    public void setAverage(double avg)
    {
        this.average=avg;
    }
    public double getAverage()
    {
        return average;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public String getGrade()
    {
        String grade = "";
        if(average>=90.0)
         grade = "A";
         else if(average>=80.0)
         grade = "B";
         else if(average>=70.0)
         grade = "C";
         else if(average>=60.0)
         grade = "D";
         else if(average>=50.0)
         grade = "E";
         else if(average<50.0)
         grade = "F";
        return grade;
    }
}