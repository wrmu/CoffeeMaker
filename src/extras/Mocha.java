package extras;

import Entity.Coffee;
import Entity.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return 0.9 + coffee.cost();
    }
}
