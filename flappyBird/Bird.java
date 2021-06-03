package flappyBird;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Bird
{
    public int x, y, width, height;
    public static final int WIDTH = 750, HEIGHT = 750;
    private Image img;
    public Bird() {
        x = WIDTH / 2;
        y = HEIGHT / 2;
        width = 40;
        height = 40;
        try {
            img = ImageIO.read(new File("src/flappyBird/bird.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(Graphics g) {
        g.drawImage(img, x, y, width, height, null);
    }

}
