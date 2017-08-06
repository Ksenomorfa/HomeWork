package command;


public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        System.out.println("Button is pressed, command...");
        slot.execute();
    }
}
