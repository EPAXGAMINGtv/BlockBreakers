package de.epaxgaming.blockbreakers.commands;

import org.bukkit.World;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class buildworld implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player ){
            Player p =( Player)commandSender;
            World world = Bukkit.getWorld("buildworld");

            if (world != null) {
                // Teleportiere den Spieler in die angegebene Welt
                p.teleport(world.getSpawnLocation());
                p.sendMessage("Du wurdest in die Welt '" + "buildworld" + "' teleportiert.");
            }



            return true;
        }
        return false;
    }
}
