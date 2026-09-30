import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int NumOfTerms = 0;
        System.out.printf("Enter Number of Terms: ");
        NumOfTerms = input.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + NumOfTerms + " terms:");
        for (int i = 1; i <= NumOfTerms; i++)
        {
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}