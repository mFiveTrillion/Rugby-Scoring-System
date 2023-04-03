package rugbyScore;

public class RugbyScore {

	private String name; //declared private instance variables for rugby score object 
	private int score;
	
	
	public String getName() {//returns name string
		return name;
	}
	public void setName(String name) {//sets instance variable to input parameter value
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	} 
	

	public RugbyScore(String name) {//rugbyScore constructor 
		this.name = name;
		this.score = 0;
		
	}
	
	public String toString() {//String representation of class object 
		return name + ": "+ "  Score: "+ score+" \n";
	
	}
	
	public void score(ScoreAction sa) {//score calculator increments score varable by int value of ScoreaAction enum type.
		
		if(sa == ScoreAction.TRY) {
			score+= 5;
		}else if(sa == ScoreAction.CONVERSIONKICK){
			score+=2;
			
		}else if(sa == ScoreAction.DROPGOAL) {
			score+=3;
		}else if(sa == ScoreAction.PENALTYKICK) {
			score+=3;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
