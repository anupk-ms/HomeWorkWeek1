package anupk;

public class Mango extends Additive {
	Beverage beverage;
	public Mango (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Mango";
	}
	public double cost() {
		return 1.65 + beverage.cost();
	}
}
