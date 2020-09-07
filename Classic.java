package anupk;

public class Classic extends Additive {
	Beverage beverage;
	public Classic (Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Classic";
	}
	public double cost() {
		return 1.21 + beverage.cost();
	}
}
