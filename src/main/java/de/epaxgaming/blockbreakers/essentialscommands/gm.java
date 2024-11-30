package de.epaxgaming.blockbreakers.essentialscommands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gm implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cBlockBreakers §7- Dieser Befehl kann nur von einem Spieler ausgeführt werden.");
            return true;
        }

        Player player = (Player) sender;

        if (!player.hasPermission("EPAX:ESSENTIALS:GAMEMODE")) {
            player.sendMessage("§cBlockBreakers §7- Du hast keine Berechtigung, um diesen Befehl auszuführen.");
            return true;
        }

        if (args.length < 1) {
            player.sendMessage("§cBlockBreakers §7- Benutzung: /gm <0|1|2|3>");
            return false;
        }

        switch (args[0]) {
            case "0":
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("§cBlockBreakers §7- Du bist jetzt im Überlebensmodus (Survival Mode).");
                break;

            case "1":
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("§cBlockBreakers §7- Du bist jetzt im Kreativmodus (Creative Mode).");
                break;

            case "2":
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("§cBlockBreakers §7- Du bist jetzt im Abenteuermodus (Adventure Mode).");
                break;

            case "3":
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("§cBlockBreakers §7- Du bist jetzt im Zuschauermodus (Spectator Mode).");
                break;

            default:
                player.sendMessage("§cBlockBreakers §7- Ungültiger Spielmodus! Benutzung: /gm <0|1|2|3>");
                return false;
        }

        return true;
    }
}
