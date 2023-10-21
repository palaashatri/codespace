package day6.activity3;

public class LambdaThread implements Runnable {

	public static void main(String[] args) {
		
		Runnable lambdaThread=()-> {System.out.println("Thead called...");};
		
		new Thread(lambdaThread).start();
	}

}
