package tripadvisor;

import java.util.ArrayList;
import java.util.List;

public class TripDirector {

    public List<Trip> trips;

    public TripDirector() {
        trips = new ArrayList<>();
    }

    public void addTrip(Trip trip){
        trips.add(trip);
    }

    public void bookOffer(double maxPrice, int minimalSpentDays, List<Continent> listOfAcceptableContinents, boolean bringDog){
        for (Trip trip : trips) {
            if(trip.getPrice() <= maxPrice
                    && trip.getDaySpent() >= minimalSpentDays
                    && listOfAcceptableContinents.contains(trip.getContinent())){
                if(bringDog && !trip.isAllowForDog()){
                    continue;
                }
                System.out.println(trip);
                trips.remove(trip);
            }
        }
    }
}
