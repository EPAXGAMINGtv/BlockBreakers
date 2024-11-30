package de.epaxgaming.blockbreakers.essentialscommands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.jetbrains.annotations.NotNull;

public class PermisionsAdd implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        if (p.hasPermission(new Permission("EPAX:ESSENTIALS:PERMSIONS"))) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§cBlockBreakers §7- Dieser Befehl kann nur von einem Spieler ausgeführt werden.");
                return true;
            }


            if (args.length < 3) {
                sender.sendMessage("§cBlockBreakers §7- Benutzung: /permissions <add|set> <permission> <player>");
                return false;
            }


            String action = args[0];
            String permission = args[1];
            String targetPlayerName = args[2];


            Player targetPlayer = Bukkit.getPlayer(targetPlayerName);
            if (targetPlayer == null) {
                sender.sendMessage("§cBlockBreakers §7- Spieler '" + targetPlayerName + "' wurde nicht gefunden.");
                return true;
            }


            PermissionAttachment attachment = targetPlayer.addAttachment(Bukkit.getPluginManager().getPlugin("BlockBreakers"));

            switch (action.toLowerCase()) {
                case "add":
                    attachment.setPermission(permission, true);
                    sender.sendMessage("§cBlockBreakers §7- Berechtigung '" + permission + "' wurde dem Spieler " + targetPlayerName + " hinzugefügt.");
                    targetPlayer.sendMessage(" §cBlockBreakers §7- Du hast die Berechtigung '" + permission + "' erhalten!");
                    break;
                case "set":
                    boolean value = Boolean.parseBoolean(args[3]);
                    attachment.setPermission(permission, value);
                    sender.sendMessage("§cBlockBreakers §7- Berechtigung '" + permission + "' wurde für den Spieler " + targetPlayerName + " auf " + value + " gesetzt.");
                    targetPlayer.sendMessage("§cBlockBreakers §7- Deine Berechtigung '" + permission + "' wurde auf " + value + " gesetzt!");
                    break;
                default:
                    sender.sendMessage("§cBlockBreakers §7- Ungültige Aktion! Benutze 'add' oder 'set'.");
                    return false;
            }

        }

        return true;
    }
}
