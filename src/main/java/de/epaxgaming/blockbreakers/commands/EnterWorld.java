package de.epaxgaming.blockbreakers.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class EnterWorld implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 1) {
                String worldName = args[0];
                World world = Bukkit.getWorld(worldName);

                if (world != null) {
                    // Teleportiere den Spieler in die angegebene Welt
                    player.teleport(world.getSpawnLocation());
                    player.sendMessage("Du wurdest in die Welt '" + worldName + "' teleportiert.");
                } else {
                    player.sendMessage("Die Welt '" + worldName + "' existiert nicht.");
                }
            } else {
                player.sendMessage("Verwendung: /enterworld <weltname>");
            }
        } else {
            sender.sendMessage("Dieser Befehl kann nur von einem Spieler ausgeführt werden.");
        }
        return true;
    }
}
