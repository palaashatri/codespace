package Activity_7;

class DeluxeACRoom extends  DeluxeRoom
{
	private int ratePerSqFeet;

    public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet = 12;
    }

    public int getRatePerSqFeet() {
        return ratePerSqFeet;
    }	
}