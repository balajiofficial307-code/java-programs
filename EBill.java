import java.util.Scanner;
class base
{
    int units;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units:");
        units = sc.nextInt();
    }
}
class derived extends base
{
    double billpay = 0;
    void amount()
    {
        input();
        if (units <= 100)
            billpay = units * 1.20;
        else if (units > 100 && units <= 300)
            billpay = 100 * 1.20 + (units - 100) * 2;
        else
            billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
    }
}
class EBill
{
    public static void main(String args[])
    {
        derived d = new derived();
        d.amount();
        System.out.println("\t\tElectricity Bill");
        System.out.println("\t\t================");
        System.out.println("\tNumber of Units: " + d.units);
        System.out.println("\tBill to pay: " + d.billpay);
    }
}