package tripadvisor;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        Trip trip = new Trip(1233, true, 7, Continent.EU);
        Trip trip1 = new Trip(7888, true, 9, Continent.AS);

        TripDirector tripDirector = new TripDirector();
        tripDirector.addTrip(trip);
        tripDirector.addTrip(trip1);


        tripDirector.bookOffer(30000,
                3,
                Arrays.asList(Continent.EU, Continent.AS),
                false);
    }
}
