package rugbyScore;

public enum ScoreAction {

	TRY(5), CONVERSIONKICK(2), PENALTYKICK(3), DROPGOAL(3);
	
	private int worth;
	
	private ScoreAction(int worth) {//enum type constructor 
	
		this.worth = worth;
		
	}
}

