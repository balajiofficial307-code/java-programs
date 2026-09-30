import java.util.Scanner;
public class WeekName
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int daynum = 0;
        System.out.printf("Enter the Weekday Number: ");
        daynum = input.nextInt();
        switch (daynum)
        {
            case 0:
                System.out.printf("Sunday");
                break;
            case 1:
                System.out.printf("Monday");
                break;
            case 2:
                System.out.printf("Tuesday");
                break;
            case 3:
                System.out.printf("Wednesday");
                break;
            case 4:
                System.out.printf("Thursday");
                break;
            case 5:
                System.out.printf("Friday");
                break;
            case 6:
                System.out.printf("Saturday");
                break;
            default:
                System.out.printf("Invalid...Please Enter the 0 to 6...");
                break;
        }
    }
}