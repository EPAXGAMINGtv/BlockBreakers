package de.epaxgaming.blockbreakers.npc;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class spawnnpc implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (commandSender.isOp()) { // Überprüfen, ob der Sender Operator ist
            if (commandSender instanceof Player) { // Überprüfen, ob der Sender ein Spieler ist
                Player player = (Player) commandSender;
                Location location = player.getLocation(); // Die Position des Spielers

                if (args.length > 0 && args[0].equalsIgnoreCase("shop")) {
                    // NPC erstellen und an der Spielerposition spawnen
                    ShopNPC npc = new ShopNPC(player.getWorld(), location); // Erstelle einen neuen NPC
                    player.sendMessage("Shop NPC wurde an deiner Position gespawnt!"); // Rückmeldung an den Spieler
                }
                if (args.length > 0 && args[0].equalsIgnoreCase("help")) {

                    HelpNPC npc = new HelpNPC(player.getWorld(), location); // Erstelle einen neuen NPC
                    player.sendMessage("Help NPC wurde an deiner Position gespawnt!"); // Rückmeldung an den Spieler
                }
                if (args.length > 0 && args[0].equalsIgnoreCase("Farmworld")) {
                    // NPC erstellen und an der Spielerposition spawnen
                    farmworldNPC npc = new farmworldNPC(player.getWorld(), location); // Erstelle einen neuen NPC
                    player.sendMessage("Farmworld NPC wurde an deiner Position gespawnt!"); // Rückmeldung an den Spieler
                }
                if (args.length > 0 && args[0].equalsIgnoreCase("buildworld")) {
                    // NPC erstellen und an der Spielerposition spawnen
                    BuildNPC npc = new BuildNPC(player.getWorld(), location); // Erstelle einen neuen NPC
                    player.sendMessage("Farmworld NPC wurde an deiner Position gespawnt!"); // Rückmeldung an den Spieler
                }
            } else {
                commandSender.sendMessage("Dieser Befehl kann nur von einem Spieler ausgeführt werden."); // Rückmeldung für nicht-Spieler
            }
        } else {
            commandSender.sendMessage("Du hast keine Berechtigung, diesen Befehl auszuführen."); // Rückmeldung für fehlende Berechtigung
        }
        return true; // Erfolgreiche Ausführung des Befehls
    }
}
