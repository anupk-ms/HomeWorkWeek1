package anupk;

public class Watermelon extends Additive {
	Beverage beverage;
	public Watermelon (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Watermelon";
	}
	public double cost() {
		return 2.05 + beverage.cost();
	}
}
