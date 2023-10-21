package Activity_9;

public class ODIMatch extends Match {
	
	public double calculateRunRate() {
		return (runs_remaining()/((50.0-getCurrentover())));
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
		return 300-balls_bowled;
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Need "+runs_remaining()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}

}