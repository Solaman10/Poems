import java.util.ArrayList;
import java.util.List;

public class Taxi {

    static int taxiCount = 0;
    int id;
    boolean booked;
    char currentSpot;
    int freeTime;
    int totalEarnings;
    List<String> trips;

    public Taxi() {

        booked = false;
        currentSpot = 'A';
        freeTime = 6;
        totalEarnings = 0;
        trips = new ArrayList<>();
        taxiCount = taxiCount+1;
        id = taxiCount;
    }

    public void setDetails (boolean booked,char currentSpot,int freeTime,int totalEarnings,String tripDetails) {

        this.booked = booked;
        this.currentSpot = currentSpot;
        this.freeTime = freeTime;
        this.totalEarnings = totalEarnings;
        this.trips.add(tripDetails);
    }

    public void printDetails() {

        System.out.println();
        System.out.println("Taxi - "+this.id+"  Total Earnings - "+this.totalEarnings);
        System.out.println("TaxiId   BookingId    CustomerId  From       To       PickupTime   DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(id+"          "+trip);
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public void printTaxiDetails () {

        System.out.println("Taxi - "+this.id+" Total Earnings - "+this.totalEarnings+" Current Spot - "+this.currentSpot+" Free Time - "+this.freeTime);
    }

}
