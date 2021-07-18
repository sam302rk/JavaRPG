package de.gamingcraft.scenes;

import de.gamingcraft.JavaRPG;
import de.gamingcraft.types.Scene;
import java.awt.*;
import java.util.Objects;
import static de.gamingcraft.RenderUtil.*;

public class MainMenu extends Scene {
    JavaRPG instance;

    public MainMenu(JavaRPG instance) {
        this.instance = instance;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        drawImage((instance.getWidth()/2)-(Objects.requireNonNull(getImage("logo")).getWidth()/2*4), instance.getHeight()/4, 65*4, 15*4, "logo", g2d);
    }

    @Override
    public String getTitle() {
        return "Main Menu";
    }

    @Override
    public boolean pauseGame() {
        return true;
    }
}
