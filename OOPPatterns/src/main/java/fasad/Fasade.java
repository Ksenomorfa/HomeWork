package fasad;


public class Fasade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    Projector projector;
    Screen screen;

    public Fasade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector, Screen screen) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watching " + movie);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Preparing to ending ");
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
