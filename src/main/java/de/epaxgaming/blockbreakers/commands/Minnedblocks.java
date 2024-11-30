package de.epaxgaming.blockbreakers.commands;

import de.epaxgaming.blockbreakers.listeners.onJoin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Minnedblocks implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player p = (Player) commandSender;

        commandSender.sendMessage("§cBlockBreaker - "+"§7Du hast "+onJoin.getPlayerInformation(p).getMinedBlocks()+" Blöcke Abgebaut!");




        return false;
    }
}
