package de.epaxgaming.blockbreakers.testcmds;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class custommodel implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player ){
            Player player = (Player)commandSender;
            ItemStack test1 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemMeta m1 = test1.getItemMeta();
            m1.setCustomModelData(1);
             test1.setItemMeta(m1);


             player.getInventory().addItem(test1);
        }

        return false;
    }
}
