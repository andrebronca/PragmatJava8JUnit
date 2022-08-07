package cap02;

public class BooleanQuestion extends Question {

	public BooleanQuestion(int id, String text) {
		super(id, text, new String[] {"No", "Yes"});
	}
	
	@Override
	public boolean match(int expect, int actual) {
		return expect == actual;
	}
	
}
