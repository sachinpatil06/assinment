import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter date of booking:");
        String dateOfBooking = scanner.nextLine();

        System.out.println("Enter assigned room number ID:");
        int roomNumberID = scanner.nextInt();

        System.out.println("\nCustomer Information:");
        System.out.println("Name: " + customerName);
        System.out.println("Date of Booking: " + dateOfBooking);
        System.out.println("Room Number ID: " + roomNumberID);

        scanner.close();
    }
}
