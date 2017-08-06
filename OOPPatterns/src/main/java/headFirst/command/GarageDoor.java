package command;

public class GarageDoor {
    String name;

    public GarageDoor() {

    }

    public GarageDoor(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Garage door is open.");
    }

    public void close() {
        System.out.println("Garage door is closed.");
    }
}
