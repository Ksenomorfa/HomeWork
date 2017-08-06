package fasad;

public class Amplifier {
    DvdPlayer dvd;
    int volume = 0;

    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("Amplifier is setting DVD");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier is on volume " + volume);
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}