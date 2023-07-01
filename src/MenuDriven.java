import java.util.Scanner;
public class MenuDriven
{
    public static void main(String []args)
    {
         Scanner input = new Scanner(System.in);
        

         double length;
         double width;
         double diameter;
         double height;
         double base;
         double hyp;
         double theta;
         double pi=3.142;
         double perimeter;

         System.out.print("1.Perimeter of square\n");
         System.out.print("2.Perimeter of a Rectangle\n");
         System.out.print("3.Perimeter of a Circle\n");
         System.out.print("4.Perimeter of a Triangle\n");
         System.out.print("5.Perimeter of Part of a circle\n");
         System.out.println();
         System.out.print("Choose from above then press enter key");
         System.out.println();

         switch (input.nextInt()) {
            case 1:
            System.out.print("Enter length of a square\n");
               length=input.nextDouble();
              
                perimeter = length*4;
                System.out.print("perimeter = "+ perimeter + " KM");
                System.out.println();
                System.out.println();
                break;

            case 2:
            System.out.print("Enter length of a Rectangle\n");
            length=input.nextDouble();
            System.out.print("Enter width of a Rectangle\n");
            width = input.nextDouble();
            perimeter= 2*(length+width);
            System.out.print("Perimeter = "+perimeter + " KM");
            System.out.println();
                System.out.println();
            break;

            case 3:
            System.out.print("Enter Diameter of a Circle\n");
            diameter=input.nextDouble();
            perimeter=pi*diameter;
            System.out.print("Circumference = "+perimeter+" KM");
            System.out.println();
                System.out.println();
            break;

            case 4:
            System.out.print("Enter base of a Triangle\n");
            base = input.nextDouble();
            System.out.print("Enter Height of a Triangle\n");
            height=input.nextDouble();
            System.out.print("Enter hypoteneus of a Triangle\n");
            hyp=input.nextDouble();
            perimeter= base+height+hyp;
            System.out.println("perimeter= "+perimeter);
    
            System.out.println();
                System.out.println();
            break;

            case 5:
            System.out.print("Enter diameter of a Circle\n");
            diameter=input.nextDouble();
            double radius=diameter/2;
            System.out.print("Enter theta of a Circle\n");
            theta = input.nextDouble();
            System.out.print("is the Arc open?(if yes, type 1, if no type 0)\n");
            int arc;
            arc=input.nextInt();
            
            switch(input.nextInt(arc))
            {
              case 1:
              perimeter=(theta/360)* pi*2*radius;
              System.out.print("perimeter of the arc is\n"+perimeter);
              break;

              case 0:
            double arcPerimeter = (theta/360)* pi*2*radius;
            perimeter = arcPerimeter+diameter;
            System.out.print("perimeter of the part of a circle is\n"+perimeter);
            System.out.println();
                System.out.println();
            break;
            }
            
         }
         
    }

}