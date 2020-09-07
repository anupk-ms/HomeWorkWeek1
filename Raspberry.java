package anupk;

public class Raspberry extends Additive {
	Beverage beverage;
	public Raspberry (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Raspberry";
	}
	public double cost() {
		return 2.25 + beverage.cost();
	}
}
