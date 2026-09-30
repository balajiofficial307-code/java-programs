import java.util.Scanner;
public class alphabetical
{
    public static void main(String[] args)
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of names to be sort:");
        n = s.nextInt();
        String names[] = new String[n];
        System.out.println("Enter the names for sorting:");
        for (int i = 0; i < n; i++)
        {
            names[i] = s.next();
        }
        System.out.println("\tAlphabetical Order");
        System.out.println("\t*****************");
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (names[i].compareTo(names[j]) > 0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
            System.out.println("\t" + names[i]);
        }
    }
}