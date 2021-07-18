package de.gamingcraft.types;

import javax.swing.*;

public abstract class Scene extends JComponent {
    public abstract String getTitle();
    public abstract boolean pauseGame();
}
