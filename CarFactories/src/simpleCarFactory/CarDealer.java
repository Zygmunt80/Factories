package simpleCarFactory;

public class CarDealer {

	public static void main(String[] args) {
		Factory factory = new Factory();
		OrderCar buyer = new OrderCar(factory);
		buyer.produceACar("combi");
		

	}

}
