package de.gamingcraft;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import static de.gamingcraft.Start.Name;

public class RenderUtil {

    public static void drawImage(int x, int y, int width, int height, String texture, Graphics2D g2d) {
        g2d.drawImage(getImage(texture), x, y, width, height, null);
    }

    public static void drawTile(int x, int y, String texture, Graphics2D g2d) {
        drawImage(8 + 48*x, 32 + 48*y, 48, 48, texture, g2d);
    }

    public static void changeCursor(String texture, JFrame frame) {
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
                getImage(texture), new Point(0, 0), Name);
        frame.getContentPane().setCursor(blankCursor);
    }

    public static BufferedImage getImage(String texture) {
        try {
            return ImageIO.read(Objects.requireNonNull(JavaRPG.class.getClassLoader().getResource(texture + ".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Draw a String centered in the middle of a Rectangle.
     *
     * @param g The Graphics instance.
     * @param text The String to draw.
     * @param rect The Rectangle to center the text in.
     */
    public static void drawCenteredString(Graphics g, String text, Rectangle rect, Font _font) {
        FontMetrics metrics = g.getFontMetrics(_font);
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        g.setFont(_font);
        g.drawString(text, x, y);
    }
}
