import java.io.*;
public class ExceptionHandlingExample
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter two numbers to divide:");
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println("Result of division: " + (a / b));
            int[] numbers = {1, 2, 3};
            System.out.println("Enter the index of the array to access:");
            int index = Integer.parseInt(reader.readLine());
            System.out.println("Element at index " + index + ": " + numbers[index]);
            String str = null;
            System.out.println("Length of the string: " + str.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index for the array.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException: Invalid number format.");
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException: Attempted to access a null object.");
        }
        catch (IOException e)
        {
            System.out.println("IOException: Error reading input.");
        }
        finally
        {
            System.out.println("Program execution completed. Cleaning up resources.");
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
                System.out.println("Error closing the reader.");
            }
        }
    }
}