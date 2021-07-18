package de.gamingcraft;

import de.gamingcraft.scenes.TitleScreen;
import de.gamingcraft.types.Scene;

import javax.swing.*;
import java.awt.*;

import static de.gamingcraft.Start.*;

public class JavaRPG extends JFrame {

    public JavaRPG() {
        setTitle(Name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateResolution(720, 480);
        RenderUtil.changeCursor("cursor", this);
        add(new TitleScreen(this));
        setVisible(true);

        ((Graphics2D)getGraphics()).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        Timer timer = new Timer(1000/30, e -> repaint());
        timer.start();
    }

    public void updateResolution(final int width, final int height) {
        Dimension sr = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(width, height);
        setLocation(sr.width/2-width/2, sr.height/2-height/2);
    }

    public void switchScene(Scene scene) {
        removeAll();
        add(scene);
        repaint();
    }
}
