
public class ArrayStack implements Stack
{
    private String names[];
    private int top;

    public ArrayStack(int length)
    {
        names=new String[length];
        top=-1;
    }
    public String peak()
    {
        String lead=names[top];
        return lead;
    }
    public String pop()
    {
        String lead=names[top];
        names[top]=null;
        return lead;
    }
    public void push(String e)
    {
        top++;
        names[top]=e;
    }
    public boolean isEmpty()
    {
        if (top==-1)
           return true;
           else
           return false;
    }
    public void display()
    {
       for (int i=top;i>=0;i--)
      System.out.println(names[i]+" \n");
       System.out.println();
    }
    public int size()
    {
        return names.length;
    }

    
}

