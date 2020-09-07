package anupk;

public class MyBar {
	public static void main(String args[]) {
		Beverage beverage1 = new Gin();
		System.out.println(beverage1.getDescription()
		+ " $" + beverage1.cost());
		
		Beverage beverage2 = new Gin();
		beverage2 = new Melon (beverage2);
		System.out.println(beverage2.getDescription()
		+ " $" + beverage2.cost());
		
		Beverage beverage3 = new Gin();
		beverage3 = new Cucumber (beverage3);
		System.out.println(beverage3.getDescription()
		+ " $" + beverage3.cost());
		
		Beverage beverage4 = new Shots();
		beverage4 = new Tequila(beverage2);
		System.out.println(beverage4.getDescription()
		+ " $" + beverage4.cost());
		
		Beverage beverage5 = new Mojitos();
		beverage5 = new Classic (beverage5);
		System.out.println(beverage5.getDescription()
		+ " $" + beverage5.cost());
		
		Beverage beverage6 = new Mojitos();
		beverage6 = new Watermelon (beverage6);
		System.out.println(beverage6.getDescription()
				+ " $" + beverage6.cost());
		
		Beverage beverage7 = new Mojitos();
		beverage7 = new Peach (beverage7);
		System.out.println(beverage7.getDescription()
				+ " $" + beverage7.cost());
		
		Beverage beverage8 = new Margaritas();
		beverage8 = new Mango (beverage8);
		System.out.println(beverage8.getDescription()
				+ " $" + beverage8.cost());
		
		Beverage beverage9 = new Margaritas();
		beverage9 = new Raspberry (beverage9);
		System.out.println(beverage9.getDescription()
				+ " $" + beverage9.cost());
	}
}