import java.util.Scanner;
public class ArrayStackTest
{
    public static void main(String []args)
    {
        ArrayStack s= new ArrayStack(7);
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Enter %s names:",s.size());
            for (int i=0;i<s.size();i++)
            s.push(input.next());
            System.out.println();
            System.out.println("The names are:");
            s.display();
        } 
        System.out.println();
         System.out.println("peek: " +s.peak());
         System.out.println("size:" +s.size());
         System.out.println("pop:" +s.pop());
         System.out.println("is Empty:" +s.isEmpty());
         
    }
}
