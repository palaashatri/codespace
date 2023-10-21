package Activity_7;
class DeluxeRoom extends HotelRoom
{
	private int ratePerSqFeet;
    private boolean hasWifitrue;

    public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        hasWifitrue = hasWifi;
        ratePerSqFeet = 10;
    }
    public int getRatePerSqFeet() {
        if (hasWifitrue)
            return ratePerSqFeet + 2;
        else
            return ratePerSqFeet;
    }	
}