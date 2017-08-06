package proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy (URL url) {
        imageUrl = url;
    }

    public int getIconHeight() {
        if(imageIcon !=null) {
            return imageIcon.getIconHeight();
        }
        return 800;
    }

    public int getIconWidth() {
        if(imageIcon !=null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
       if (imageIcon !=null) {
           //если объект существует, требование о перерисовке передается ему
           imageIcon.paintIcon(c,g,x,y);
       } else {
           //иначе выдается сообщение о загрузке
           g.drawString("Loading CD cover, please wait...", x+300, y+190);
           if (!retrieving) {
               retrieving = true;
               //загрузка выполняется в отдельном потоке
               retrievalThread = new Thread(new Runnable() {
                   public void run() {
                       try {
                           imageIcon = new ImageIcon(imageUrl,"CD Cover");
                           //после окончания загрузки перерисовываем форму
                           c.repaint();
                       } catch (Exception e) {
                           e.printStackTrace();
                       }
                   }
               });
               retrievalThread.start();
           }
       }
    }

    public URL getImageUrl() {
        return imageUrl;
    }
}
