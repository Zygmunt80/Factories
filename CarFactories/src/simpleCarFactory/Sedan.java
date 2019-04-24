package simpleCarFactory;

public class Sedan extends Car{
	public Sedan() {
		name = "Sedan";
		topSpeed = 170;
		weight = 1420;		
	}
	@Override
	public String special() {
		return "I' elegant";
	}
}