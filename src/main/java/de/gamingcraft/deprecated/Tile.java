package de.gamingcraft.deprecated;

import javax.swing.*;
import java.awt.*;
import static de.gamingcraft.RenderUtil.*;

@Deprecated
public class Tile extends JComponent {

    public final int x, y;
    public final String tile;

    @Deprecated
    public Tile(int x, int y, String tile) {
        this.x = x;
        this.y = y;
        this.tile = tile;
    }

    @Override @Deprecated
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        drawTile(x, y, tile, g2d);
    }
}
