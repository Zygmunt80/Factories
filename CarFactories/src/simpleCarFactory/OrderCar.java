package simpleCarFactory;

public class OrderCar {
	Factory factory;
	
	OrderCar(Factory somefactory){
		this.factory = somefactory;
	}
	
	public Car produceACar(String type) {
		Factory carFactory = factory;
		Car car = carFactory.orderCar(type);
		car.horn();
		car.startEngine();
		System.out.println(car.toString());
		
		return car;
	}

}
