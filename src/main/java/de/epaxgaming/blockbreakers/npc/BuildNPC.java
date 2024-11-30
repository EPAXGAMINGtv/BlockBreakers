package de.epaxgaming.blockbreakers.npc;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.World;

public class BuildNPC {
    private final Villager entity;

    public BuildNPC(World world, Location location) {

        this.entity = (Villager) world.spawnEntity(location, EntityType.VILLAGER);


        location.setY(location.getY() + 0);
        entity.teleport(location);


        entity.setAI(false);
        entity.setCollidable(false);
        entity.setInvulnerable(true);
        entity.setCustomName("BauWelt");
        entity.setCustomNameVisible(true);
    }

    public Villager getEntity() {
        return this.entity;
    }
}
