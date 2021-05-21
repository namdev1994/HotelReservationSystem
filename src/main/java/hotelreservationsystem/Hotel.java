package hotelreservationsystem;

public class Hotel {
    String hotelName;
    int customerRate;
    int weekDays,weekEndDays;

    public Hotel(String hotelName, int weekDays, int weekEndDays) {
        this.hotelName = hotelName;
        this.weekDays = weekDays;
        this.weekEndDays = weekEndDays;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getCustomerRate() {
        return customerRate;
    }

    public void setCustomerRate(int customerRate) {
        this.customerRate = customerRate;
    }

    public Hotel(String hotelName, int customerRate) {
        this.hotelName=hotelName;
        this.customerRate=customerRate;
    }
    public void setRate(int noOfDays) {
        this.customerRate = this.customerRate*noOfDays;
    }
}
