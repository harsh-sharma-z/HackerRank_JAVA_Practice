import java.util.*;
class zeroorneg extends Exception
{
    public zeroorneg (String msg)
    {
        super (msg);
    }
}
public class smerror
{
    public static void validatemarks(int marks) throws zeroorneg
    {
        if(marks<0)
        {
            throw new zeroorneg("Negative marks entered.");
        }
        else
        if(marks==0)
        {
            throw new zeroorneg("Zero marks entered.");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try {
            int a1, a2, b1, b2, c1, c2;
            System.out.println("Enter marks of the first student:");
            a1 = sc.nextInt();
            validatemarks(a1);
            b1 = sc.nextInt();
            validatemarks(b1);
            c1 = sc.nextInt();
            validatemarks(c1);
            System.out.println("Enter marks of the second student:");
            a2 = sc.nextInt();
            validatemarks(a2);
            b2 = sc.nextInt();
            validatemarks(b2);
            c2 = sc.nextInt();
            validatemarks(c2);

            double avg1 = (a1 + b1 + c1) / 3;
            double avg2 = (a2 + b2 + c2) / 3;

            System.out.println("Average marks of first student=" + avg1);
            System.out.println("Average marks of second student=" + avg2);
        }
        catch(NumberFormatException a)
        {
            System.out.println("Enter a integer only.");
        }
        catch(zeroorneg e)
        {
            System.out.println(e.getMessage());
        }

    }

}
