package de.epaxgaming.blockbreakers.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import static org.bukkit.Bukkit.getPlayer;
import static org.bukkit.Bukkit.getServer;

public class inventrycloese implements Listener {
    public boolean inInv = false;
    public void onInventoryClose(InventoryCloseEvent e) {
        Player p = (Player) e;




    }
}
