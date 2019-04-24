package simpleCarFactory;

public class Factory {
	
	public Car orderCar(String type) {
		Car car;
		if (type.equals("combi")) {
			car = new Combi();
		} else if (type.equals("cabriolet")) {
			car = new Cabriolet();		
		} else {
			car = new Sedan();
		}
		return car;
	}
	
}
