package simpleCarFactory;

public abstract class Car {
	String name;
	int topSpeed;
	int weight;
	public void startEngine() {
		System.out.println("engine starting");
	}
	public void horn() {
		System.out.println("beep beep");
	}
	abstract String special();
	
	public String toString() {
		String description = "this is " + name + "\n" +
				" car with max speed " + topSpeed + "km/h " + "\n" +
				" it weight " + weight + "kg" + "\n" + special();
		return description.toString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
