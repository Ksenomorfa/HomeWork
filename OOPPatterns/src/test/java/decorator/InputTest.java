package decorator;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.Document;
import java.io.*;

public class InputTest extends Assert {
    @Test
    public void test() throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream((new FileInputStream("text.txt"))));

            while ((c = in.read()) >= 0) {
                System.out.print((char) (c));
            }
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
