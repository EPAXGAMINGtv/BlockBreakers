package de.epaxgaming.blockbreakers.commands;

import de.epaxgaming.blockbreakers.BlockBreakers;
import de.epaxgaming.blockbreakers.listeners.onJoin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class level implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player ) {
            Player p = (Player) commandSender;
            onJoin.getPlayerInformation(p).getLevel();
            commandSender.sendMessage("§cBLockBreakers -"+" §7Dein Level ist "+ onJoin.getPlayerInformation(p).getLevel()+"!");
        }

        return false;
    }
}
