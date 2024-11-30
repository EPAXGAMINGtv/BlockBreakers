package de.epaxgaming.blockbreakers.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player = (Player)commandSender;
        World world = Bukkit.getWorld("Spawn");

        if (world != null) {

            player.teleport(world.getSpawnLocation());
            player.sendMessage("Du wurdest in die Welt '" + "Spawn" + "' teleportiert.");
            player.setGameMode(GameMode.ADVENTURE);
        }



        return false;
    }
}
