public class Burger
{
    private String name;
    private String filling;
    private double price;
    private String bun;

    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    

	public Burger(String name, String filling, double price, String bun) {
		this.name=name;
		this.filling=filling;
		this.price=price;
		this.bun=bun;
	}

	public void AddBurger1(String name, double price) {
        this.add1Name = name;
        this.add1Price = price;
    }

    public void AddBurger2(String name, double price) {
        this.add2Name = name;
        this.add2Price = price;
    }
    public void AddBurger3(String name, double price) {
        this.add3Name = name;
        this.add3Price = price;
    }
    public void AddBurger4(String name, double price) {
        this.add4Name = name;
        this.add4Price = price;
    }

    public double BurgerCost() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger " + " with " + this.bun + " bun "
                    + "with " + this.filling + ", price is "  + this.price);
        if(this.add1Name != null) {
            burgerPrice += this.add1Price;
            System.out.println("Added " + this.add1Name + " for an extra " + this.add1Price);
        }
        if(this.add2Name != null) {
            burgerPrice += this.add2Price;
            System.out.println("Added " + this.add2Name + " for an extra " + this.add2Price);
        }
        if(this.add3Name != null) {
            burgerPrice += this.add3Price;
            System.out.println("Added " + this.add3Name + " for an extra " + this.add3Price);
        }
        if(this.add4Name != null) {
            burgerPrice += this.add4Price;
            System.out.println("Added " + this.add4Name + " for an extra " + this.add4Price);
        }

        return burgerPrice;
    }
}