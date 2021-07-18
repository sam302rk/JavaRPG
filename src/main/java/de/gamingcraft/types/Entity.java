package de.gamingcraft.types;

public interface Entity extends GameObject {
    /**
     * @return Is the Entity a Player or a NPC?
     */
    boolean isNPC();

    /**
     * Gets run everytime a player interacts with this Entity using the Interact Key.
     */
    void onInteract();
}
