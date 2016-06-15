package fasad;

public class DvdPlayer {
    public void on() {
        System.out.println("DVDPlayer is on");
    }

    public void play(String movie) {
        System.out.println("DVDPlayer is playing" + movie);
    }

    public void stop() {
        System.out.println("DVDPlayer is stopped");
    }

    public void eject() {
        System.out.println("DVDPlayer is ejected DVD");
    }

    public void off() {
        System.out.println("DVDPlayer is off");
    }
}
