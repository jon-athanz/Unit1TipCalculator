import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double totalTip;
        double finalBill;
        double tipPerPerson;
        double totalPerPerson;

        System.out.println("Enter the total bill: ");
        double bill = scan.nextDouble();

        System.out.println("Enter the tip percentage: ");
        int tipPercent = scan.nextInt();

        System.out.println("Enter the number of people: ");
        int people = scan.nextInt();

        totalTip = (tipPercent / 100.0) * bill;
        System.out.println("Total Tip Amount: $" + df.format(totalTip));

        finalBill = totalTip + bill;
        System.out.println("Total Bill Including Tip: $" + df.format(finalBill));

        tipPerPerson = totalTip / people;
        System.out.println("Tip Per Person: $" + df.format(tipPerPerson));

        totalPerPerson = finalBill / people;
        System.out.println("Total Per Person: $" + df.format(totalPerPerson));
    }
}