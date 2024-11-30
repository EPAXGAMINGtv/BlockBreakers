package de.epaxgaming.blockbreakers.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class NoDropsListener implements Listener {
   public boolean drops = true;
    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        Player p = (Player) event;


        if (p.getWorld().equals("farmworld")) {

            if (drops == true) {
                event.getDrops().clear();
                event.setDroppedExp(0);
            }
        }
    }
}
