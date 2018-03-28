
//import java.util.Iterator;

public class  CustomerDetails  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateBill bill=new GenerateBill("Vijeta Raikar",1649);
		PizzaDetails Chickenpizza=new PizzaDetails("Chicken pizza", 170);
		PizzaDetails cornpizza=new PizzaDetails("corn pizza", 100);
		PizzaDetails mushroompizza = new PizzaDetails("mushroom pizza", 120);
		PizzaDetails Paneerpizza= new PizzaDetails("Paneer pizza", 130);
		
		bill.add(new OrderdPizza(Chickenpizza, 2));
		bill.add(new OrderdPizza(cornpizza, 2));
		bill.add(new OrderdPizza(mushroompizza, 5));
		bill.add(new OrderdPizza(Paneerpizza, 2));
		
		bill.printBill();
		
		
	}
}
