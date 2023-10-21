package Activity_7;

class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;
    private boolean hasWifitrue;

    public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        hasWifitrue = hasWifi;
        ratePerSqFeet = 15;
    }

    public int getRatePerSqFeet() {
        if (hasWifitrue)
            return (ratePerSqFeet + 2);
        else
            return ratePerSqFeet;
    }
}
