package anupk;

public class Cucumber extends Additive {
	Beverage beverage;
	public Cucumber (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Cucumber";
	}
	public double cost() {
		return 2.25 + beverage.cost();
	}
}
