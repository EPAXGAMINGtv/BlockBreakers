package de.epaxgaming.blockbreakers.essentialscommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.jetbrains.annotations.NotNull;

public class fly implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player ){
            Player p = (Player) commandSender;
            if (p.hasPermission(new Permission("EPAX:ESSENTIALS:FLY"))){
                if (p.getAllowFlight()==true) {
                    p.sendMessage();
                    p.setFlying(false);
                    p.setAllowFlight(false);
                } else {
                    p.setAllowFlight(true);
                    p.setFlying(true);
                }
            }else {
                commandSender.sendMessage("§c BlockBreakers $7- Diese command Exestiert nicht!");
            }
        }

        return false;
    }
}
