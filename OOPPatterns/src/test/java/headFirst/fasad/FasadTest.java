package fasad;

import org.junit.Assert;
import org.junit.Test;

public class FasadTest extends Assert{
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner();
    DvdPlayer dvd = new DvdPlayer();
    Projector projector = new Projector();
    Screen screen = new Screen();

    @Test
    public void test() {
        Fasade fasade = new Fasade(amp,tuner, dvd,projector,screen);
        fasade.watchMovie("Matrix");
        fasade.endMovie();
    }
}
