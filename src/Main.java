import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Here I create the variables needed
        double totalTip;
        double finalBill;
        double tipPerPerson;
        double totalPerPerson;

        //Here I prompt the user for information about the bill, tip, and # of people
        System.out.println("Enter the total bill: ");
        double bill = scan.nextDouble();

        System.out.println("Enter the tip percentage: ");
        int tipPercent = scan.nextInt();

        System.out.println("Enter the number of people: ");
        int people = scan.nextInt();

        //Here I calculate the total tip
        totalTip = (tipPercent / 100.0) * bill;
        System.out.println("Total Tip Amount: $" + df.format(totalTip));

        //Here I calculate the final bill including the tip
        finalBill = totalTip + bill;
        System.out.println("Total Bill Including Tip: $" + df.format(finalBill));

        //Here I calculate the tip per person
        tipPerPerson = totalTip / people;
        System.out.println("Tip Per Person: $" + df.format(tipPerPerson));

        //Here I calculate the total per person
        totalPerPerson = finalBill / people;
        System.out.println("Total Per Person: $" + df.format(totalPerPerson));
    }
}