package anupk;

public class Peach extends Additive {
	Beverage beverage;
	public Peach (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Peach";
	}
	public double cost() {
		return 3.25 + beverage.cost();
	}
}
