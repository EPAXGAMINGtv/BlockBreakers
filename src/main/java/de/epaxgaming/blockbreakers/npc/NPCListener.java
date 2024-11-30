package de.epaxgaming.blockbreakers.events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Material.*;

public class NPCListener implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        if (event.getRightClicked() instanceof Villager) {
            Player player = event.getPlayer();
            Villager villager = (Villager) event.getRightClicked();
            if (villager.getCustomName() != null && villager.getCustomName().equals("Farmworld")) {
                World world = Bukkit.getWorld("Farmworld");
                event.setCancelled(true);
                player.setGameMode(GameMode.SURVIVAL);
                if (world != null) {
                    // Teleportiere den Spieler in die angegebene Welt
                    player.teleport(world.getSpawnLocation());
                    player.sendMessage("Du wurdest in die Welt '" + "Farmworld" + "' teleportiert.");
                }


            }

            if (villager.getCustomName() != null && villager.getCustomName().equals("BauWelt")) {
                World world = Bukkit.getWorld("Buildworld");
                event.setCancelled(true);
                player.setGameMode(GameMode.SURVIVAL);
                if (world != null) {
                    // Teleportiere den Spieler in die angegebene Welt
                    player.teleport(world.getSpawnLocation());
                    player.sendMessage("Du wurdest in die Welt '" + "BuildWorld" + "' teleportiert.");
                }


            }
            if (villager.getCustomName() != null && villager.getCustomName().equals("Help")) {
                Player p = event.getPlayer();


                Inventory inventory1 = Bukkit.createInventory(null, 9 * 3, "Help");


                ItemStack black = new ItemStack(BLACK_STAINED_GLASS_PANE);
                for (int i = 0; i < 9 * 3; i++) {
                    inventory1.setItem(i, black);
                }
                ItemStack i1 = new ItemStack(PAPER);
                ItemMeta m1 = i1.getItemMeta();
                m1.setDisplayName("Was ist BlockBreakers?");
                List<String> lore = new ArrayList<>();
                lore.add("Es ist ein Gamemode wo das zeil ist Viele blöcke");
                lore.add("abzubauen wovon du coins bekommst!");
                m1.setLore(lore);
                i1.setItemMeta(m1);
                inventory1.setItem(10 ,i1 );

                ItemStack i2 = new ItemStack(PAPER);
                ItemMeta m2 = i2.getItemMeta();
                m2.setDisplayName("Was Kann ich in BlockBreakers  Tuen ?");
                List<String> lore1 = new ArrayList<>();
                lore1.add("Sie können blöckeabauen um coins zu bekommen!");
                lore1.add("mit /help finden sie alle commands");

                m2.setLore(lore1);
                i2.setItemMeta(m2);
                inventory1.setItem(12 ,i2 );
                player.openInventory(inventory1);
            }

            if (villager.getCustomName() != null && villager.getCustomName().equals("Shop")) {




                Inventory inventory = Bukkit.createInventory(null, 9 * 6, "Shop");


                ItemStack black = new ItemStack(BLACK_STAINED_GLASS_PANE);


                for (int i = 0; i < 9 * 6; i++) {
                    inventory.setItem(i, black);
                }

                ItemStack toolsItem = new ItemStack(DIAMOND_SWORD);
                ItemMeta toolsMeta = toolsItem.getItemMeta();
                toolsMeta.setDisplayName("§7Tools");
                toolsItem.setItemMeta(toolsMeta);
                inventory.setItem(11, toolsItem);


                ItemStack closeItem = new ItemStack(BARRIER);
                ItemMeta closeMeta = closeItem.getItemMeta();
                closeMeta.setDisplayName("§4Close");
                closeItem.setItemMeta(closeMeta);
                inventory.setItem(53, closeItem);


                player.openInventory(inventory);
            }
        }


    }
    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Villager) {
            Villager villager = (Villager) event.getEntity();
            // Überprüfen, ob der Villager den Namen "Shop" hat
            if ("Shop".equals(villager.getCustomName())) {

                event.setCancelled(true);
            }
            if ("Help".equals(villager.getCustomName())) {

                event.setCancelled(true);
            }
        }
    }
}
