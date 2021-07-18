package de.gamingcraft.types;

public interface Tile extends GameObject {
    /**
     * @return Can NPCs and Players go through this tile?
     */
    boolean isSolid();
}
