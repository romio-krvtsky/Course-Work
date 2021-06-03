package flappyBird;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Renderer1 extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        FlappyBird.flappyBird.repaint(g);
    }

}