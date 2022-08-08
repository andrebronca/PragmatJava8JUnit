package cap03;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void hasPositiveBalance() {
//		assertThat(1 > 2, is(true));
		assertThat(null, notNullValue());
	}

}
