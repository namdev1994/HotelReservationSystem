package hotelreservationsystem;
import java.util.*;

import java.util.ArrayList;

public class HotelReservation {
    static List<Hotel> hotelsList=new ArrayList<Hotel>();
    static Scanner sc = new Scanner(System.in);
    public static void addHotel( Hotel hotel) // add hotels
    {
        hotelsList.add(hotel);
    }
    public List<Hotel> getHotelsList() {
        return hotelsList;
    }
    public static void main(String[] args) {
        System.out.println("Welcome In Hotel Reservation System");
    }
}
