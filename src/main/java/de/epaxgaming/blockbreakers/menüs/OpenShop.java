package de.epaxgaming.blockbreakers.menüs;

import de.epaxgaming.blockbreakers.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Material.*;

public class OpenShop implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player p)) return false;

        Inventory inventory = Bukkit.createInventory(null, 9 * 6, "Shop");

        for (int i = 0; i < 9 * 6; i++) {
            inventory.setItem(i, new ItemBuilder(BLACK_STAINED_GLASS_PANE).setDisplayname("").build());
        }

        inventory.setItem(11, new ItemBuilder(DIAMOND_SWORD).setDisplayname("§7Tools").build());
        inventory.setItem(53, new ItemBuilder(DIAMOND_SWORD).setDisplayname("§4Close").build());

        p.openInventory(inventory);

        return true;
    }
}