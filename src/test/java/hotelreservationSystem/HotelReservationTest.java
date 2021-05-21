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


}
