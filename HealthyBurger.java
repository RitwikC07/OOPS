public class HealthyBurger extends Burger {

    private String HExtra1Name;
    private double HExtra1Price;

    private String HExtra2Name;
    private double HExtra2Price;

    

    public HealthyBurger(String filling, double price) {
		super ("Healthy" ,filling, price, "Brown" );
	}

	public void AddHealth1(String name, double price) {
        this.HExtra1Name = name;
        this.HExtra1Price = price;
    }

    public void AddHealth2(String name, double price) {
        this.HExtra2Name = name;
        this.HExtra2Price = price;
    }

    @Override
    public double BurgerCost() {
        double burgerPrice = super.BurgerCost();
        if(this.HExtra1Name != null) {
            burgerPrice += this.HExtra1Price;
            System.out.println("Added " + this.HExtra1Name + " for an extra " + this.HExtra1Price);
        }
        if(this.HExtra2Name != null) {
            burgerPrice += this.HExtra2Price;
            System.out.println("Added " + this.HExtra2Name + " for an extra " + this.HExtra2Price);
        }

        return burgerPrice;
    }
}