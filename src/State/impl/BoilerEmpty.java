package State.impl;

import Entity.CoffeeMachine;
import State.MachineState;

public class BoilerEmpty implements MachineState {
    public BoilerEmpty(CoffeeMachine coffeeMachine) {
    }

    @Override
    public void boilerHeaterOn() {

    }

    @Override
    public void boilerHeaterOff() {

    }

    @Override
    public void pressureReliefOpen() {

    }

    @Override
    public void pressureReliefClose() {

    }

    @Override
    public void plateHeaterOn() {

    }

    @Override
    public void plateHeaterOff() {

    }
}
