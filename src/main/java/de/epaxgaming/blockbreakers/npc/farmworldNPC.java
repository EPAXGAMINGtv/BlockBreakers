package de.epaxgaming.blockbreakers.npc;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.World;

public class farmworldNPC {
    private final Villager entity;

    public farmworldNPC(World world, Location location) {
        // Spawne den NPC (hier als Beispiel ein Villager)
        this.entity = (Villager) world.spawnEntity(location, EntityType.VILLAGER);

        // Stelle den NPC in der Luft
        location.setY(location.getY() + 0);
        entity.teleport(location);

        // Mache den NPC unbeweglich und setze den Namen
        entity.setAI(false); // Deaktiviert die KI des NPCs
        entity.setCollidable(false); // Macht den NPC nicht kollidierbar
        entity.setInvulnerable(true); // Mache den NPC unverwundbar
        entity.setCustomName("Farmworld"); // Setze den Namen des NPCs
        entity.setCustomNameVisible(true); // Mache den Namen sichtbar
    }

    public Villager getEntity() {
        return this.entity;
    }
}
