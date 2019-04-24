package simpleCarFactory;

public class Combi extends Car{
	public Combi() {
		name = "Combi";
		topSpeed = 140;
		weight = 1500;		
	}
	@Override
	public String special() {
		return "I have additional packing space";
	}
}
