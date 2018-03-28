


import java.util.ArrayList;

public class GenerateBill {
	private float total;

	ArrayList<OrderdPizza> dishes = new ArrayList<OrderdPizza>();

	private String custName;
	private int BillNo;
	
	public GenerateBill(String custName,int BillNo) {
		// TODO Auto-generated constructor stub
		this.custName=custName;
		this.BillNo=BillNo;
	}

	public void add(OrderdPizza dish) throws NullPointerException {
		try{
			this.dishes.add(dish);
		}catch (NullPointerException e) {
			throw e;
		}
	}
	
	public void printBill(){
		try{
			System.out.println("-------------------------------NAVTARA RESTAURANT---------------------------------");
			System.out.println("Customer Name: "+this.custName);
			System.out.println("Bill Number: " +this.BillNo);
			System.out.println("__________________________________________________________________________________");
			System.out.println("\tName\t\t | \tPrice\t |\tQuatity\t |     total\t |");
			System.out.println("__________________________________________________________________________________");
			
			for(int i=0; i<dishes.size();i++){
				System.out.println(this.dishes.get(i).dish.getName()+"\t\t\t"+this.dishes.get(i).dish.getPrice()+
						"\t\t"+this.dishes.get(i).quantity+"\t\t"+this.dishes.get(i).quantity*this.dishes.get(i).dish.getPrice()+"\t");
				this.total+=this.dishes.get(i).quantity*this.dishes.get(i).dish.getPrice();
			}
			System.out.println("__________________________________________________________________________________");
			
			System.out.println("Grand Total: "+this.total);
			System.out.println("Total After applying 8% GST: "+(total+(total*8/100)));
			System.out.println("---------------------------------THANK YOU :-)----------------------------------------");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("----------print failere---------");
		}
		
	}
	
}

