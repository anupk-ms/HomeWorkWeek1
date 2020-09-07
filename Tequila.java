package anupk;

public class Tequila extends Additive {
	Beverage beverage;
	public Tequila (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Tequila";
	}
	public double cost() {
		return 2.25 + beverage.cost();
	}
}