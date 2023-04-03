package rugbyScore;

public class RugbyScoreTest {

	public static void main(String[] args) {

		
			RugbyScore blues = new RugbyScore("Blues"); //instansiates new rugbyScore object 
			
			System.out.println(blues);
			blues.score(ScoreAction.TRY); //.score accesses score method within the rugbyScore class
			
			System.out.println(blues);
			
			blues.score(ScoreAction.CONVERSIONKICK);
			System.out.println(blues);
			
			blues.score(ScoreAction.PENALTYKICK);
			System.out.println(blues);

			blues.score(ScoreAction.TRY);

			blues.score(ScoreAction.PENALTYKICK);

			blues.score(ScoreAction.TRY);

			blues.score(ScoreAction.CONVERSIONKICK);
			
			System.out.println(blues);
			
			blues.score(ScoreAction.TRY);
			
			System.out.println(blues);
			
	}

}
