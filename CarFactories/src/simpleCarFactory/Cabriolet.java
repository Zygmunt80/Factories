package simpleCarFactory;

public class Cabriolet extends Car{

	public Cabriolet() {
		name = "Cabriolet";
		topSpeed = 190;
		weight = 1350;		
	}
	@Override
	public String special() {
		return "I can open the ruff";
	}
}