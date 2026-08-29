import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeJava {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime myObj2 = LocalTime.now(); // Create a time object
        System.out.println(myObj2); // Display the current time

        LocalDateTime myObj3 = LocalDateTime.now(); // Create a date-time object
        System.out.println(myObj3); // Display the current date and time

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myObj3.format(myFormatObj); // Format date-time
        System.out.println("After formatting: " + formattedDate); // Display the formatted date-time
    }
}
