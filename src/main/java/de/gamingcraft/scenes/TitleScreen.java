package de.gamingcraft.scenes;

import de.gamingcraft.JavaRPG;
import de.gamingcraft.types.Scene;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;
import static de.gamingcraft.RenderUtil.*;

public class TitleScreen extends Scene {
    private final JavaRPG instance;
    private float y = 24;
    private boolean i = false;

    public TitleScreen(JavaRPG instance) {
        this.instance = instance;
        addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) { } @Override public void mousePressed(MouseEvent e) { }
            @Override public void mouseReleased(MouseEvent e) { instance.switchScene(new MainMenu(instance)); }
            @Override public void mouseEntered(MouseEvent e) { } @Override public void mouseExited(MouseEvent e) { }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if(y==26)i=!i;if(y==22)i=!i;if(i)y+=0.5F;if(!i)y-=0.5F;
        drawCenteredString(g, "Click to start", new Rectangle(instance.getWidth(), instance.getHeight()), new Font("Arial", Font.PLAIN, Math.round(y)));
        drawImage((instance.getWidth()/2)-(Objects.requireNonNull(getImage("logo")).getWidth()/2*4), instance.getHeight()/4, 65*4, 15*4, "logo", g2d);
    }

    @Override
    public String getTitle() {
        return "Welcome back!";
    }

    @Override
    public boolean pauseGame() {
        return true;
    }
}
