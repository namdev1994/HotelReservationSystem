package hotelreservationSystem;

import hotelreservationsystem.Hotel;
import hotelreservationsystem.HotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationTest {
    @Test
    public void hotelAddTest() //test for add Hotel
    {
        HotelReservation hotelReservation = new HotelReservation();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservation.addHotel(hotel);
        List hotelsList=hotelReservation.getHotelsList();
        Assertions.assertTrue(hotelsList.contains(hotel));
    }

    @Test
    void checkCheapHotelTest() {
        HotelReservation hotelReservation = new HotelReservation();
        Hotel Lakewood = new Hotel("Lakewood",110);
        Hotel Bridgewood = new Hotel("Bridgewood",120);
        Hotel RidgeWood = new Hotel("Ridgewood",130);
        hotelReservation.addHotel(Lakewood);
        hotelReservation.addHotel(Bridgewood);
        hotelReservation.addHotel(RidgeWood);
        int days = hotelReservation.NoOfDays("05-20-2021","05-22-2021");
        Hotel result = hotelReservation.checkChepiesRatetHotel(days);
        System.out.println(result);
        Assertions.assertEquals(Lakewood,result);

    }
}
