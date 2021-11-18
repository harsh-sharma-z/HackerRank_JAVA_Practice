import java.util.Scanner;

public class errorpractice {
    public static void main(String args[])
    {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Enter the number of elements in the array:");
            n = Integer.parseInt(System.in);
            int a[] = new int[n];
            System.out.println("Enter elements in the array:");
            for (int i = 0; i < n; i++)
                a[n] = Integer.parseInt(System.in);
            System.out.println("Enter the index:");
            int ix = Integer.parseInt(System.in);
            System.out.println("The array element succesfully accessed!");
        }
        catch (NumberFormatException a)
        {
            System.out.println("Enter valid data");

        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("Not a valid index.");
        }



    }

}
