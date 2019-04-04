package Entity;

import State.MachineState;
import State.impl.*;


public class CoffeeMachine {
    final static int STRONG = 1;
    final static int MEDIUM = 2;
    final static int LIGHT = 3;

    MachineState boilerEmpty;
    MachineState boilerNotEmpty;
    MachineState plateEmpty;
    MachineState potEmpty;
    MachineState potNotEmpty;

    MachineState machineState;

    int count = 0;
    int level = 0;

    public CoffeeMachine(int boiler) {
        boilerEmpty = new BoilerEmpty(this);
        boilerNotEmpty = new BoilerNotEmpty(this);
        plateEmpty = new PlateEmpty(this);
        potEmpty = new PotEmpty(this);
        potNotEmpty = new PotNotEmpty(this);
        this.count = boiler;
        this.level = MEDIUM;

        if (boiler > 0) {
            machineState = boilerNotEmpty;
        } else {
            machineState = boilerEmpty;
        }
    }

    public CoffeeMachine(int boiler, int level) {
        boilerEmpty = new BoilerEmpty(this);
        boilerNotEmpty = new BoilerNotEmpty(this);
        plateEmpty = new PlateEmpty(this);
        potEmpty = new PotEmpty(this);
        potNotEmpty = new PotNotEmpty(this);
        this.count = boiler;
        this.level = level;

        if (boiler > 0) {
            machineState = boilerNotEmpty;
        } else {
            machineState = boilerEmpty;
        }
    }

    public MachineState getMachineState() {
        return machineState;
    }

    public void setMachineState(MachineState machineState) {
        this.machineState = machineState;
    }

    public MachineState getBoilerEmpty() {
        return boilerEmpty;
    }

    public MachineState getBoilerNotEmpty() {
        return boilerNotEmpty;
    }

    public MachineState getPlateEmpty() {
        return plateEmpty;
    }

    public MachineState getPotEmpty() {
        return potEmpty;
    }

    public MachineState getPotNotEmpty() {
        return potNotEmpty;
    }

    public void BeginBrew() {

    }

    public void interruptBrew() {
        machineState.boilerHeaterOff();
    }
}
