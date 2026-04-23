
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class  DateDifferenceCalculator  {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String d1 = sc.nextLine();
        String d2 = sc.nextLine();

        LocalDate start = LocalDate.parse(d1);
        LocalDate end = LocalDate.parse(d2);

        long days = ChronoUnit.DAYS.between(start, end);

        System.out.println(days + " days");
    }
}