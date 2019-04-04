package State;

public interface MachineState {

    void boilerHeaterOn();

    void boilerHeaterOff();

    void pressureReliefOpen();

    void pressureReliefClose();

    void plateHeaterOn();

    void plateHeaterOff();

}
