package de.epaxgaming.blockbreakers.essentialscommands;

import de.epaxgaming.blockbreakers.BlockBreakers;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.jetbrains.annotations.NotNull;

public class fly implements CommandExecutor {
    private final BlockBreakers plugin;

    public fly(BlockBreakers plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
             boolean isflying=false;
             String flying = "disabeld";

             if (isflying == false){
                 flying = "disabeld";
             }else {
                 flying = "enabeld";
             }

        if (commandSender instanceof Player ){
            Player p = (Player) commandSender;
            if (p.hasPermission(new Permission("EPAX:ESSENTIALS:FLY"))){
                if (p.getAllowFlight()==true) {
                    isflying = false;
                    p.sendMessage(plugin.messagePrefix +flying);
                    p.setFlying(false);
                    p.setAllowFlight(false);
                } else {
                    p.sendMessage(plugin.messagePrefix +flying);
                    p.setAllowFlight(true);
                    p.setFlying(true);
                }
            }else {
                commandSender.sendMessage(plugin.messagePrefix+" Diese command Exestiert nicht!");
            }
        }

        return false;
    }
}
