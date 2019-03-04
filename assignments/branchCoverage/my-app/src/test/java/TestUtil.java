import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
	@Test
  public void testLength() {
	  
	boolean kontrol=c.compute(6);
	  
	  assertFalse(kontrol);
						
						
						}
}