package command;

public class Stereo {
    int volume;
    String name;
    public Stereo() {

    }
    public Stereo(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("Stereo is on.");
    }
    public void setCD() {
        System.out.println("Stereo is setting CD.");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("StereoVolume is " + volume);
    }
    public void off() {
        System.out.println("Stereo is off.");
    }
}
