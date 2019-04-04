package extras;

import Entity.Coffee;
import Entity.CondimentDecorator;

public class Condiments extends CondimentDecorator {
    private Coffee coffee;

    public Condiments(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " , Condiments";
    }

    @Override
    public double cost() {
        return 0.5 + coffee.cost();
    }
}
