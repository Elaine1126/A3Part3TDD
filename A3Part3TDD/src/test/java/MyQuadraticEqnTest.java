import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyQuadraticEqnTest {
	
	MyQuadraticEqn obj;

	@Before
	public void setUp() throws Exception {
		obj = new MyQuadraticEqn();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {		 		
		//given equation: x^2 + 6x + 9=0 (a=1,b=6,c=9)
		//roots = -b +/- sqrt(b^2-4ac)/2a
		double root1 = (-6 + Math.sqrt((6 * 6) - (4 * 1 * 9))) / (2*1);
		double root2 = (-6 - Math.sqrt((6 * 6) - (4 * 1 * 9))) / (2*1); 
		assertEquals(root1, obj.findroot1((-6 + Math.sqrt((6 * 6) - (4 * 1 * 9))) / (2*1)));
		assertEquals(root2, obj.findroot2((-6 - Math.sqrt((6 * 6) - (4 * 1 * 9))) / (2*1)));
	}

}
