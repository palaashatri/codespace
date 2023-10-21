package Activity_9;

public class TestMatch extends Match {
	
	public double calculateRunRate() {
		return (runs_remaining()/((90.0-getCurrentover())));
	}
	
	public int runs_remaining()
	{
		int score=getCurrentscore();
		int target=getTarget();
		int needed_runs=target-score;
		return needed_runs;
	}
	
	public  int calculateBalls() {
		int balls_bowled=6*(int)getCurrentover();
		return 540-balls_bowled;
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Needed "+runs_remaining()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}

}