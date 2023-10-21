package Activity_9;

import java.util.*;

public class MatchMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ODIMatch odi;
		T20Match t20;
		TestMatch test;
		int ch;
		do {
		System.out.println("\nEnter the match format\n\n1. ODI\n2. T20\n3. Test");
		ch=sc.nextInt();
		switch(ch) {
		case 1:odi=new ODIMatch();
			   System.out.println("Enter the Current score");
			   odi.setCurrentscore(sc.nextInt());
			   System.out.println("Enter the Current Over");
			   odi.setCurrentover(sc.nextFloat());
			   System.out.println("Enter Target Score");
			   odi.setTarget(sc.nextInt());
			   double rr=odi.calculateRunRate();
			   int balls=odi.calculateBalls();
			   odi.display(rr, balls);
			   break;
		case 2:t20=new T20Match();
			   System.out.println("Enter the Current score");
			   t20.setCurrentscore(sc.nextInt());
			   System.out.println("Enter the Current Over");
			   t20.setCurrentover(sc.nextFloat());
			   System.out.println("Enter Target Score");
			   t20.setTarget(sc.nextInt());
			   double runr=t20.calculateRunRate();
			   int ball_s=t20.calculateBalls();
			   t20.display(runr, ball_s);
			   break;
		case 3:test=new TestMatch();
			   System.out.println("Enter the Current score");
			   test.setCurrentscore(sc.nextInt());
			   System.out.println("Enter the Current Over");
			   test.setCurrentover(sc.nextFloat());
			   System.out.println("Enter Target Score");
			   test.setTarget(sc.nextInt());
			   double run_r=test.calculateRunRate();
			   int bal_s=test.calculateBalls();
			   test.display(run_r, bal_s);
		       break;	   
		
		
		}
		}while(ch==1||ch==2||ch==3);

        sc.close();
	}

}
