
public class OrderdPizza {
	public PizzaDetails dish;
	public int quantity;
	
	public OrderdPizza(PizzaDetails dish, int quantity){
		try{
			this.dish=dish;
			this.quantity=quantity;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
