package cap02;

public class PercentileQuestion extends Question {

	public PercentileQuestion(int id, String text, String[] answerChoices) {
		super(id, text, answerChoices);
	}
	
	@Override
	public boolean match(int expect, int actual) {
		return expect <= actual;
	}

}
