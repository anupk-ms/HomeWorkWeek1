package anupk;

public class Melon extends Additive {
	Beverage beverage;
	public Melon (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Melon";
	}
	public double cost() {
		return 1.25 + beverage.cost();
	}
}
