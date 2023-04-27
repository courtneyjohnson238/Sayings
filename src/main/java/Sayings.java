import java.util.Scanner;

public class Sayings {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

            String[] sayings = {
            "Don't bite the hand that feeds you", "Not all the glitters is gold", "Strike while the iron is hot",
            "Better late than never", "Don't judge a book by its cover", "Many hands make light work", "Honesty" +
            "is the best policy", "Rome wasn't built in a day", "Actions speak louder than words", "It's the tip of" +
            "the iceberg"};
            String condition = "yes";
            while (condition.equalsIgnoreCase("yes")){
                try {
                    System.out.print("Pick a saying (select #1 - #10): ");
                int index = scanner.nextInt();
                scanner.nextLine();
                index--;
                // change number from range 1-6 to range 0-5
                // as long as the user entered a number in the range
                // of 1 to 6, this will work. Otherwise, the index
                // will be out of range.
                System.out.println(sayings[index]);
                System.out.print("Do you want to print another phrase? yes for more.\n Any other input for exit ");
                condition = scanner.nextLine();



            System.out.print("Error ");
        } catch (Exception e) {
        }}}}
