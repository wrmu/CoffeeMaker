package Entity;

public class BasicBlackCoffee extends Coffee {
    public BasicBlackCoffee() {
        description = "BasicBlackCoffee";
    }

    @Override
    public double cost() {
        return 1.1;
    }
}
