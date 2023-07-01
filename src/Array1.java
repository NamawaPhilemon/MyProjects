public class Array1
{
    public static void main(String args[])
    {
        int array[] = new int[10];

        System.out.printf("%5s%8s%n","Index","Value");

        for(int counter=0;counter<array.length;counter++)
        System.out.printf("%6s%8s%n",counter,array[counter]);

    }
}