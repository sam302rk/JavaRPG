package de.gamingcraft.deprecated;

import javax.swing.*;
import java.awt.*;

import static de.gamingcraft.RenderUtil.*;

@Deprecated
public class Player extends JComponent {
    @Deprecated
    public int currentX, currentY, wantedX, wantedY;

    @Deprecated
    public Player(int x, int y) {
        this.currentX = x;
        this.currentY = y;
        this.wantedX = x;
        this.wantedY = y;
    }

    @Override @Deprecated
    protected void paintComponent(Graphics g) {
        if (currentX > wantedX) currentX--;
        if (currentY > wantedY) currentY--;
        if (currentX < wantedX) currentX++;
        if (currentY < wantedY) currentY++;
        Graphics2D g2d = (Graphics2D) g;
        if (!(currentX == wantedX && currentY == wantedY)) drawImage(wantedX + 27/2, wantedY + 45 - 11, 20, 22, "x", g2d);
        drawImage(currentX, currentY, 27, 45, "player", g2d);
    }
}
