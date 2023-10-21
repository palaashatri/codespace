package Activity_6;
public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int numOfDoors;
	
	
	public FourWheeler() {
		super();
		this.audioSystem="";
		this.numOfDoors=0;
		
	}
	
	public FourWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,String audioSystem, int numOfDoors) {
		super(make, vehicleNumber,fuelType,fuelCapacity,cc);
		this.audioSystem=audioSystem;
		this.numOfDoors=numOfDoors;
				
	}
	
	public void displayDetailInfo() {
		System.out.println("Detail Information");
		System.out.println("Audio System:"+audioSystem);
		System.out.println("Number of Doors:"+numOfDoors);
	}

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

}