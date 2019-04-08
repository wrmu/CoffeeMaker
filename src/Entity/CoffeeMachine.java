package Entity;

import State.MachineState;


public class CoffeeMachine {
    final static int STRONG = 1;
    final static int MEDIUM = 2;
    final static int LIGHT = 3;


    MachineState machineState;

    int count = 0;
    int level = 0;

    public CoffeeMachine(int boiler) {

        this.count = boiler;
        this.level = MEDIUM;


    }

    public CoffeeMachine(int boiler, int level) {

        this.count = boiler;
        this.level = level;


    }

    public MachineState getMachineState() {
        return machineState;
    }

    public void setMachineState(MachineState machineState) {
        this.machineState = machineState;
    }

}
