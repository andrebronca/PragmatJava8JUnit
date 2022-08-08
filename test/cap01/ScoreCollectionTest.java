package cap01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScoreCollectionTest {

	@Test
	public void answersArithmeticMeanOfTwoNumbers() {
		//arrange
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);
		
		//act
		int actualResult = collection.arithmeticMean();
		
		//assert
//		assertThat(actualResult, equalTo(6));
		assertEquals(actualResult, 6);
	}

}
