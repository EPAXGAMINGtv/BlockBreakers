package de.epaxgaming.blockbreakers.commands;

import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;

public class Famrworld implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player ){
            Player player = ( Player) commandSender;
            player.setGameMode(GameMode.SURVIVAL);
            World world = Bukkit.getWorld("Farmworld");

            if (world != null) {

                player.teleport(world.getSpawnLocation());
                player.sendMessage("Du wurdest in die Welt '" + "Farmworld" + "' teleportiert.");
            }
        }

        return false;
    }
}
