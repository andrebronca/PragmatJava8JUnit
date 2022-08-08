package cap02b;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfileTest {
	
	private Profile profile;
	private BooleanQuestion question;
	private Criteria criteria;
	
	@Before
	public void create() {
		profile = new Profile("Bull Hockey, Inc.");
		question = new BooleanQuestion(1, "Got bonuses?");
		criteria = new Criteria();
	}

//	@Test
//	public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
//		Answer profileAnswer = new Answer(Bool.FALSE, question);
//		profile.add(profileAnswer);
//		Answer criteriaAnswer = new Answer(Bool.TRUE, question);
//		Criterion criterion = new Criterion(Weight.MustMatch, criteriaAnswer);
//		criteria.add(criterion);
//		
//		boolean matches = profile.matchs(criteria);
//		assertFalse(matches);
//	}
//	
//	@Test
//	public void matchAnswersTrueForAnyDontCareCriteria() {
//		Answer  profileAnswer = new Answer(Bool.FALSE, question);
//		profile.add(profileAnswer);
//		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
//		Criterion criterion = new Criterion(Weight.DontCare, criteriaAnswer);
//		criteria.add(criterion);
//		
//		boolean matches = profile.matchs(criteria);
//		assertTrue(matches);
//	}
	
	@Test
	public void matchAnswersFalseWhenMustMatchCriteriaNotMet2() {
		profile.add(new Answer(Bool.FALSE, question));
		criteria.add(new Criterion(Weight.MustMatch, 
				new Answer(Bool.TRUE, question)));
		boolean matches = profile.matchs(criteria);
		assertFalse(matches);
	}
	
	@Test
	public void matchAnswersTrueForAnyDontCareCriteria2() {
		profile.add(new Answer(question, Bool.FALSE));
		criteria.add(
				new Criterion(Weight.DontCare, new Answer(question, Bool.TRUE))
				);
		boolean matches = profile.matchs(criteria);
		assertTrue(matches);
	}

}
