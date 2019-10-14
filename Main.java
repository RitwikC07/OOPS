public class Main
{
	public static void main(String[] args)
	{
	   Burger b = new Burger("Basic", "Chicken", 80, "White");
	   b.AddBurger1("Tomato", 10);
	   b.AddBurger2("Mayo", 20);
	   b.AddBurger3("Cheese", 15);
	   System.out.println("Total Basic Burger price is " + b.BurgerCost());
	   HealthyBurger hb = new HealthyBurger("Low Fat Patty", 100);
	   hb.AddHealth1("Egg", 30);
	   hb.AddHealth2("Peas", 20);
	   System.out.println("Total Healthy Burger price is  " + hb.BurgerCost());
	   DeluxeBurger db = new DeluxeBurger();
	   db.AddBurger3("Mayo", 20);
	   System.out.println("Total Deluxe Burger price is  " + db.BurgerCost());
    }
}