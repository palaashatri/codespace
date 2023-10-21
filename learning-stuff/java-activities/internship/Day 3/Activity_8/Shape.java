package Activity_8;
public abstract class Shape {
	int value;
	
	public abstract void calculateArea(int value);

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


}