import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int invalidAnswer = 0;

        System.out.println("Enter the day of the week!");

        while (invalidAnswer == 0) {
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            in = in.toLowerCase(Locale.ROOT);

            switch (in) {
                case "monday":
                    System.out.println("Its Monday");
                    invalidAnswer++;
                    break;

                case "tuesday":
                    System.out.println("Its Tuesday");
                    invalidAnswer++;
                    break;

                case "wednesday":
                    System.out.println("Its Wednesday");
                    invalidAnswer++;
                    break;

                case "thursday":
                    System.out.println("Its Thursday");
                    invalidAnswer++;
                    break;

                case "friday":
                    System.out.println("Its Friday");
                    invalidAnswer++;
                    break;

                case "saturday":
                    System.out.println("Its Saturday");
                    invalidAnswer++;
                    break;

                case "sunday":
                    System.out.println("Its Sunday");
                    invalidAnswer++;
                    break;

                default:
                    System.out.println("Not Sure what day it is");
                    System.out.println("Try Again!");
                    break;
            }

        }
    }
}
