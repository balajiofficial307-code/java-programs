class NumberPrinter extends Thread
{
    public void run()
    {
        System.out.println("Thread 1: Printing numbers from 1 to 10");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Thread 1: " + i);
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread 1 interrupted.");
            }
        }
    }
}
class ArraySumCalculator extends Thread
{
    private int[] numbers;
    public ArraySumCalculator(int[] numbers)
    {
        this.numbers = numbers;
    }
    public void run()
    {
        System.out.println("Thread 2: Calculating the sum of the array");
        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
            try
            {
                Thread.sleep(400);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread 2 interrupted.");
            }
        }
        System.out.println("Thread 2: The sum of the array is " + sum);
    }
}
class MessageDisplayer implements Runnable
{
    public void run()
    {
        System.out.println("Thread 3: Displaying message 5 times");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Thread 3: This is a multithreading example.");
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread 3 interrupted.");
            }
        }
    }
}
public class MultithreadingExample
{
    public static void main(String[] args)
    {
        Thread thread1 = new NumberPrinter();
        Thread thread2 = new ArraySumCalculator(new int[]{10, 20, 30, 40, 50});
        Thread thread3 = new Thread(new MessageDisplayer());
        thread1.start();
        thread2.start();
        thread3.start();
        try
        {
            thread1.join();
            thread2.join();
            thread3.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("All threads have completed execution.");
    }
}