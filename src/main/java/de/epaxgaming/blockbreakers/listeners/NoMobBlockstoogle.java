package de.epaxgaming.blockbreakers.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import de.epaxgaming.blockbreakers.listeners.NoDropsListener.*;

public class NoMobBlockstoogle implements Listener {
    public boolean drops = true;
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player p =( Player)event;
        if (p.getWorld().equals("farmworld")) {

            if (drops == true) {

                event.setDropItems(false);
                event.setDropItems(false);
            }
        }
    }

}
