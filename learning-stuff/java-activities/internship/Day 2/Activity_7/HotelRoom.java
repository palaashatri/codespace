package Activity_7;

public class HotelRoom {

    private String hotelName;
    private int numberOfSqFeet;
    private boolean hasTV;
    private boolean hasWifi;

    public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getNumberOfSqFeet() {
        return numberOfSqFeet;
    }

    public void calculateTariff(int numberOfSqFeet, int rate) {
        // has to be filled
        int cost = numberOfSqFeet * rate;
        System.out.println("Room Tariff Per Day is: " + cost);
    }

    public int getRatePerSqFeet() {
        return 0;
    }
    
}
