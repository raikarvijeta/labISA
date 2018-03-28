import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Before;


public class PizzaDetailsTest {
	PizzaDetails p1;
	@Before
	public void setUp() throws Exception {
		p1=new PizzaDetails ("Panner Pizza",200);
	}

	@Test
	public void testPizzaDetails() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		assertEquals(p1.getName(),"Panner Pizza");
	}

	@Test
	public void testgetPrice() {
		//fail("Not yet implemented");
		assertEquals(p1.getPrice(),200);
	}

	
	@Test
	public void testGetPrice() {
		//fail("Not yet implemented");
		
		extracted(p1);
		}

	private void extracted(PizzaDetails p1) {
			assertEquals(200,p1.getPrice());
		}
	

	}
