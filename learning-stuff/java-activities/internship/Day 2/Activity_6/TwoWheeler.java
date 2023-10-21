package Activity_6;
public class TwoWheeler extends Vehicle {
    private boolean kickStartAvailable;
	
	public TwoWheeler() {
		super();
		this.kickStartAvailable=false;	
	}

	public TwoWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,boolean kickStartAvailable) {
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.kickStartAvailable= kickStartAvailable;	
	}
	
	public void displayDetailInfo() {
		System.out.println("Detail Information");
		System.out.print("Kick Start Available:");
		if(kickStartAvailable) {
		   System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		System.out.println();
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
}