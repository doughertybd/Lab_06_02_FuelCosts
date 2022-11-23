import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tankSize = 0;
        double mPG = 0;
        double gasPrice = 0;
        double costPerMiles = 0;
        double range;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the gallons of gas in the tank: ");
        if (in.hasNextDouble())
        {
            tankSize = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash +". Please restart the program and enter a correct value.");
        }

        System.out.println("Enter the fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble())
        {
            mPG = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash +". Please restart the program and enter a correct value.");
        }

        System.out.println("Enter the price of gas per gallon: ");
        if (in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash +". Please restart the program and enter a correct value.");
        }

        costPerMiles = 100 / mPG * gasPrice;
        range = tankSize * mPG;

        System.out.println("The cost of gas for 100 miles is $" + costPerMiles + " and the range is " + range);

    }
}
