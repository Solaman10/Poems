import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Booking {

    public static void bookTaxi(int customerId,char pickupPoint,char dropPoint,int pickupTime,List<Taxi> freeTaxies) {

        int min = 1000;
        int distanceBetweenPickupAndDrop = 0;
        int earning = 0;
        int nextFreeTime = 0;
        char nextSpot = 'Z';
        int bookingId = 0;
        Taxi bookedTaxi = null;

        String tripDetail = "";

        for(Taxi t:freeTaxies)
        {
            int distanceBetweenCustomerAndTaxi = Math.abs((t.currentSpot - '0') - (pickupPoint - '0')) * 15;
            if(distanceBetweenCustomerAndTaxi < min)
            {
                bookingId = customerId;
                bookedTaxi = t;
                distanceBetweenPickupAndDrop = Math.abs((dropPoint - '0') - (pickupPoint - '0')) * 15;
                earning = (distanceBetweenPickupAndDrop - 5) * 10 + 100;

                int dropTime = pickupTime + (distanceBetweenPickupAndDrop/15) - '0';

                nextFreeTime = dropTime;

                nextSpot = dropPoint;

                tripDetail = bookingId+"          "+customerId+"          "+pickupPoint+"          "+dropPoint+"          "+(pickupTime-'0')+"          "+dropTime+"          "+earning;
                min = distanceBetweenCustomerAndTaxi;
            }
        }

        bookedTaxi.setDetails(true,nextSpot,nextFreeTime,bookedTaxi.totalEarnings+earning,tripDetail);
        System.out.println("Taxi "+bookedTaxi.id+" booked");
    }

    public static List<Taxi> createTaxis(int n) {

        List<Taxi> taxis = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Taxi t = new Taxi();
            taxis.add(t);
        }
        return taxis;
    }

    public static List<Taxi> getFreeTaxie(List<Taxi> taxis,int pickupTime,int dropTime) {

        List<Taxi> freeTaxis = new ArrayList<>();
        for(Taxi t:taxis)
        {
            if(t.freeTime<=pickupTime && Math.abs(t.currentSpot - '0') - (pickupTime - '0') <= (pickupTime - t.freeTime))
               freeTaxis.add(t);
        }
        return freeTaxis;
    }

    public static void main(String[] args) {

        List<Taxi> taxis = createTaxis(6);

        Scanner sc = new Scanner(System.in);
        int id = 1;
        boolean optn = true;

        while (optn)
        {
            System.out.println();
            System.out.println("1 -> Book taxi");
            System.out.println("2 -> Print taxi details");
            System.out.println("3 -> Exit");
            int choice;
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: {
                    int CustomerId = id;
                    System.out.print("Enter Pickup point: ");
                    char pickupPoint = sc.next().charAt(0);
                    System.out.print("Enter Drop Point: ");
                    char dropPoint = sc.next().charAt(0);
                    System.out.print("Enter Pickup Time: ");
                    char pickupTime = sc.next().charAt(0);

                    if (pickupPoint < 'A' || dropPoint > 'F' || pickupPoint > 'F' || dropPoint < 'A') {
                        System.out.print("Valid pickup and drop points are A,B,C,D,E,F only ");
                        continue;
                    }

                    List<Taxi> freeTaxies = getFreeTaxie(taxis, pickupTime, pickupPoint);

                    if (freeTaxies.size() == 0) {
                        System.out.println("Sorry, no taxi can been allocated");
                        return;
                    }

                    Collections.sort(freeTaxies, (a, b) -> a.totalEarnings - b.totalEarnings);

                    bookTaxi(id, pickupPoint, dropPoint, pickupTime, freeTaxies);
                    id++;
                    break;
                }
                case 2: {
                    System.out.println();
                    for (Taxi t : taxis)
                        t.printTaxiDetails();
                    for (Taxi t : taxis)
                        t.printDetails();
                    break;

                }
                case 3: {
                    optn = false;
                }
                default:
                    return;
            }
        }
    }
}
