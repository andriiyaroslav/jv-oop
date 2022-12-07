package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started working");
    }

    public void stopWork() {
        System.out.println("Truck finished working");
    }
}