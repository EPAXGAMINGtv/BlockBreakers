package de.epaxgaming.blockbreakers.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Help implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage(ChatColor.GREEN + "==== Hilfe ====");
            if (args.length == 0) {

            } else if (args.length == 1) {
                // Hilfe zu einem spezifischen Befehl
                if (args[0].equalsIgnoreCase("admin")) {
                    if (player.isOp()) {
                        commandSender.sendMessage("==== Hilfe =====");
                        commandSender.sendMessage("um BlockBreakers einzurichten können brauchen sie ein plugin für die spawnprotection und luckperms ");
                        commandSender.sendMessage("als erstes must du ein spawn einrichten wo du mit /spawnnpc verschiedene viliger spawnen kannst !");

                    } else {
                        commandSender.sendMessage("§cBlockBreakers §7- Sie haben keine permisions dafür!");

                    }
                }
            }

        }
        return false;
    }
}
