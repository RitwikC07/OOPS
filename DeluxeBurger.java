public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe", "Double Chicken", 120, "White");
        super.AddBurger1("Fries", 20);
        super.AddBurger2("Cold Drink", 50);
    }

    @Override
    public void AddBurger1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void AddBurger2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void AddBurger3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void AddBurger4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
