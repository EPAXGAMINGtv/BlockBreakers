package de.epaxgaming.blockbreakers.menüs;

import de.epaxgaming.blockbreakers.BlockBreakers;
import de.epaxgaming.blockbreakers.listeners.onJoin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import de.epaxgaming.blockbreakers.listeners.onClick.*;

import java.awt.event.ItemEvent;

import static org.bukkit.Bukkit.getServer;
import static org.bukkit.Material.*;

public class Shop1 implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        // Überprüfen, ob der CommandSender ein Spieler ist

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Dieser Befehl kann nur von einem Spieler ausgeführt werden.");
            return true;
        }

        // Spielerobjekt erhalten
        Player p = (Player) commandSender;

        // Inventar erstellen
        Inventory inventory = Bukkit.createInventory(null, 9 * 6, "Shop");

        // Schwarzes Glasfenster-Item erstellen
        ItemStack black = new ItemStack(BLACK_STAINED_GLASS_PANE);

        // Das Inventar mit schwarzen Glasfenstern auffüllen
        for (int i = 0; i < 9 * 6; i++) {
            inventory.setItem(i, black);
        }
        ItemStack i2 = new ItemStack(DIAMOND_SWORD);
        ItemMeta m2 = i2.getItemMeta();
        m2.setDisplayName("§7Tools");
        i2.setItemMeta(m2);
        ItemStack i1 = new ItemStack(BARRIER);
        ItemMeta m1 = i1.getItemMeta();
        m1.setDisplayName("§4Close");
        i1.setItemMeta(m1);
        inventory.setItem(53,i1);
        inventory.setItem(11,i2);

        // Das Inventar für den Spieler öffnen
        p.openInventory(inventory);

        return true; // Befehl erfolgreich ausgeführt
    }
}
