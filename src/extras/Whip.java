package extras;

import Entity.Coffee;
import Entity.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Coffee coffee;

    public Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return 1.25 + coffee.cost();
    }
}
