package de.epaxgaming.blockbreakers.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CreateWorld implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 1) {
                String worldName = args[0];
                WorldCreator creator = new WorldCreator(worldName);
                World world = Bukkit.createWorld(creator);

                if (world != null) {
                    player.sendMessage("Welt '" + worldName + "' wurde erfolgreich erstellt.");
                } else {
                    player.sendMessage("Fehler beim Erstellen der Welt. Überprüfe den Namen und versuche es erneut.");
                }
            } else {
                player.sendMessage("Verwendung: /createworld <weltname>");
            }
        } else {
            sender.sendMessage("Dieser Befehl kann nur von einem Spieler ausgeführt werden.");
        }
        return true;
    }
}
