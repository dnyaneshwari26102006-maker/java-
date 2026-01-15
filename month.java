
// WAP that determines number of days in given month and year
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("enter a month(jan - dec)");
        String m = sc.nextLine();
        switch (m.toLowerCase()) {
            case "april":
            case "jun":
            case "aug":
            case "oct":
            case "dec":
                System.out.println("number of days of given month is 30");
                break;

            case "jan":
            case "march":
            case "may":
            case "july":
            case "sept":
            case "nov":
                System.out.println("number of days of given month is 31");
                break;

            case "feb":
                if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
                    System.out.println("number of days in  given month is 29");

                else
                    System.out.println("number of days in  given month is 28 ");
                break;

            default:
                System.out.println("Enter valid month");

        }

    }
}