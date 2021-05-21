package hotelreservationsystem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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

    public int NoOfDays(String firstDate,String lastDate) {


            // Create an instance of the SimpleDateFormat class
            SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");

            // In the try block, we will try to find the difference
            try {

                // Use parse method to get date object of both dates
                Date date1 = obj.parse(firstDate);
                Date date2 = obj.parse(lastDate);

                // Calucalte time difference in milliseconds
                int time_difference = (int) (date2.getTime() - date1.getTime());

                // Calucalte time difference in days using TimeUnit class
                int days_difference = (int) (TimeUnit.MILLISECONDS.toDays(time_difference) % 365);
            }
            // Catch parse exception
            catch (ParseException excep) {
                excep.printStackTrace();
            }
        int days_difference = 0;
        return days_difference;
        }


    public Hotel checkChepiesRatetHotel(int NoOfDays) {
        hotelsList.stream().map(p -> {p.setRate(NoOfDays); return p.customerRate; }).collect(Collectors.toList());
        Hotel cheapestRate =  hotelsList.stream().min(Comparator.comparing(Hotel::getCustomerRate)).orElse(null);
        return cheapestRate;

    }
    public static void main(String[] args) {
        System.out.println("Welcome In Hotel Reservation System");
    }

}
