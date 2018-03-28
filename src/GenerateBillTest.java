import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class GenerateBillTest {
	GenerateBill bill;

	PizzaDetails Chickenpizza=new PizzaDetails("Chickenpizza", 170);
	PizzaDetails cornpizza=new PizzaDetails("corn pizza", 100);
	PizzaDetails mushroompizza = new PizzaDetails("mushroom pizza", 120);
	PizzaDetails Paneerpizza= new PizzaDetails("Paneer pizza", 130);
	
	ArrayList<CustomerDetails> Pizzas;

	@Before
	public void setUp() throws Exception {
		bill=new GenerateBill("Vijeta raikar",1649);
		Pizzas = new ArrayList<CustomerDetails>();
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		bill.add(new OrderdPizza(Chickenpizza, 2));
		bill.add(new OrderdPizza(cornpizza, 2));
		bill.add(new OrderdPizza(mushroompizza, 5));
		bill.add(new OrderdPizza(Paneerpizza, 2));
		bill.printBill();
		
	}

	@Test
	public void testPrintBill() {
		//fail("Not yet implemented");
		//assertEquals("vijeta raikar",bill.printBill());

	}

	

}

