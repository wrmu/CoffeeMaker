package test;

import Entity.CoffeeMachine;
import State.MachineState;
import org.junit.Test;

public class TestMachine {
    @Test
    public void testBrewCoffee() {
        CoffeeMachine machine = new CoffeeMachine(12);
        MachineState machineState = machine.getMachineState();
        String s = machineState.getClass().toString();
        System.out.println(s);
    }

    @Test
    public void testPourCoffee() {

    }

    @Test
    public void testPourInterruptBrewing() {

    }
}

