import java.util.Scanner;

class Room {
    private int roomNumber;
    private int floorNumber;

    public Room(int roomNumber, int floorNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}

class Customer {
    private String name;
    private String dateOfBooking;
    private Room room;

    public Customer(String name, String dateOfBooking, Room room) {
        this.name = name;
        this.dateOfBooking = dateOfBooking;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public Room getRoom() {
        return room;
    }
}

public class extentclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();

        System.out.println("Enter date of booking:");
        String dateOfBooking = scanner.nextLine();

        System.out.println("Enter assigned room number:");
        int roomNumber = scanner.nextInt();

        System.out.println("Enter floor number:");
        int floorNumber = scanner.nextInt();

        Room room = new Room(roomNumber, floorNumber);
        Customer customer = new Customer(name, dateOfBooking, room);

        
        System.out.println("\nCustomer Booking Record:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Date of Booking: " + customer.getDateOfBooking());
        System.out.println("Room Number: " + customer.getRoom().getRoomNumber());
        System.out.println("Floor Number: " + customer.getRoom().getFloorNumber());

        scanner.close();
    }
}