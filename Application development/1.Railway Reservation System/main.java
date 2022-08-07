package RailwayTicketBookingSystem;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Train train = new Train();

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("1.Book Ticket");
            System.out.println("2.Cancel ticket");
            System.out.println("3.Booked Ticket");
            System.out.println("4.Available Ticket");
            System.out.println("5.Exit");
            System.out.print("Enter your choice : ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    train.bookTicket(generateTicket());
                    break;
                case 2:
                    train.cancelTicket(generateTicket());
                    break;
                case 3:
                    train.displayAllTickets();
                    break;
                case 4:
                    train.availabelTickets();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public static Ticket generateTicket() {
        System.out.print("Name : ");
        String name = in.next();
        System.out.print("Age : ");
        int age = in.nextInt();
        System.out.print("Gender : ");
        String gender = in.next();
        System.out.print("Berth preference (LB,MB and UB) : ");
        String berthpref = in.next();
        return new Ticket(name, age, gender, berthpref);
    }
}
