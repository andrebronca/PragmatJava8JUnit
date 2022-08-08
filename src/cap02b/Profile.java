package cap02b;

import java.util.HashMap;
import java.util.Map;

public class Profile {
	private Map<String, Answer> answers = new HashMap<>();
	private int score;
	private String name;
	
	public Profile(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void add(Answer answer) {
		answers.put(answer.getQuestionText(), answer);
	}
	
	public boolean matchs(Criteria criteria) {
		score = 0;
		boolean kill = false;
		boolean anyMatches = false;
		
		for(Criterion c : criteria) {
			Answer answer = answers.get(c.getAnswer().getQuestionText());
			boolean match = 
					c.getWeight() == Weight.DontCare
					|| answer.match(c.getAnswer());
			if (!match && c.getWeight() == Weight.MustMatch) {
				kill = true;
			}
			if (match) {
				score += c.getWeight().getValue();
			}
			anyMatches |= match;
		}
		if (kill) {
			return false;
		}
		return anyMatches;
	}
	
	public int score() {
		return score;
	}
}
