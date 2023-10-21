package Activity_8;

public class Square extends Shape {

	public void calculateArea(int value) {
		float area=value*value;
		System.out.println("Area of square is:"+String.format("%.2f",area));
		
	}
}