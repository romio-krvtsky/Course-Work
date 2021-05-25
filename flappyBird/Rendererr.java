package flappyBird;

import java.awt.*;
import javax.swing.JPanel;

public class Rendererr extends JPanel
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }

}