package classandmethodExample;

import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Invoices invoice = new Invoices();

        System.out.print("what is your electric consumption? ");
        int consumpt = scan.nextInt();

        String myElectric = invoice.evaluateElectric(consumpt);

        System.out.print("What is your internet speed? ");
        int speed = scan.nextInt();
        String myInternet = invoice.evaluateInternet(speed);

        Loans loan = new Loans();

        System.out.print("Yor monthly payment?");
        int monthlyPay = scan.nextInt();
        System.out.print("Which payment as month? ");
        int month = scan.nextInt();
        int mortgage = loan.calculateMartgage(month ,monthlyPay);

        System.out.print("What is your car total price? ");
        int carPrice = scan.nextInt();
        System.out.print("What is your instalment quantity? ");
        int months = scan.nextInt();
        double carInsurance = loan.calculateCarInsurance(carPrice,months);

        System.out.println("Your electric is "+ myElectric);
        System.out.println("Your internet is "+myInternet);
        System.out.println("Your mortgage is "+mortgage);
        System.out.println("Your insurance is "+carInsurance);



        Sugesstions suggestion = new Sugesstions();
        suggestion.suggestFood();
        suggestion.suggestCloth();





    }
}