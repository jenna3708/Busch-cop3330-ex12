import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the principal:");
        String principal = input.next();
        int convPrincipal = Integer.parseInt(principal);

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter the rate of interest:");
        String rate = input2.next();
        double convRate = Double.parseDouble(rate);

        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter the number of years:");
        String years = input3.next();
        int convYears = Integer.parseInt(years);

        //converting percent to decimal
        double rateDec = convRate / 100;

        //getting investment over the years
        double investment = convPrincipal * (1 + (rateDec * convYears));


        System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+String.format("%.0f",investment));


    }
}

