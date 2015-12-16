import static org.junit.Assert.*;

import org.junit.Test;

public class outputTest {

	@Test
	public void testAddition() {
		assertEquals("positive Addition", 2, HelloWorld.addition(1,1) );
		assertEquals("negative Addition", 0, HelloWorld.addition(-1, 1));
		assertEquals("double negative Addition", -2, HelloWorld.addition(-1, -1));
	}
}
