package de.epaxgaming.blockbreakers.commands;

import de.epaxgaming.blockbreakers.BlockBreakers;
import de.epaxgaming.blockbreakers.cahtDesign.sendTitle;
import de.epaxgaming.blockbreakers.listeners.OnJoin;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class money implements CommandExecutor, TabCompleter {

    BlockBreakers plugin;

    public money(BlockBreakers plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (args.length == 3) {
                if (args[0].equalsIgnoreCase("pay")) {
                    int ammount = 0;
                    try {
                        ammount = Integer.parseInt(args[1]);
                    } catch (NumberFormatException e) {
                        sendTitle.sendHotbarTitle("#0fd14f", "Bitte gib eine gültige zahl an!", p);
                        return true;
                    }
                    if (ammount < OnJoin.getPlayerInformation(p).getCoins()) {
                        Player targetPlayer = plugin.getServer().getPlayer(args[2]);

                        OnJoin.getPlayerInformation(targetPlayer).setCoins(OnJoin.getPlayerInformation(targetPlayer).getCoins() + ammount);
                        OnJoin.getPlayerInformation(p).setCoins(OnJoin.getPlayerInformation(p).getCoins() - ammount);
                        sendTitle.sendHotbarTitle("#0fd14f", "Du hast erolgreich " + ammount + " Coins an " + targetPlayer.getName() + " überwiesen!", p);
                    } else {
                        sendTitle.sendHotbarTitle("#0fd14f", "Du hast nicht genügend coins!", p);
                    }

                } else if (args[0].equalsIgnoreCase("set")) {
                    if (p.isOp()) {
                        int ammount = 0;
                        try {
                            int ammountdjdhkjf = Integer.parseInt(args[1]);
                            ammount =  ammountdjdhkjf;
                        } catch (NumberFormatException e) {
                            sendTitle.sendHotbarTitle("#0fd14f", "Bitte gib eine gültige zahl an!", p);
                            return true;
                        }
                        Player targetPlayer = plugin.getServer().getPlayer(args[2]);
                        OnJoin.getPlayerInformation(targetPlayer).setCoins(ammount);
                        sendTitle.sendHotbarTitle("#0fd14f", "Du hast erolgreich die Coins von " + targetPlayer.getName() + " auf " + ammount + " gesetzt!", p);
                    } else {
                        sendTitle.sendHotbarTitle("#0fd14f", "Du hast nicht die Berechtigung um diesen Befehl auszuführen!", p);
                    }
                } else if (args[0].equalsIgnoreCase("give")) {
                    if (p.isOp()) {
                        int ammount = 0;
                        try {
                            ammount = Integer.parseInt(args[1]);
                        } catch (NumberFormatException e) {
                            sendTitle.sendHotbarTitle("#0fd14f", "Bitte gib eine gültige zahl an!", p);
                            return true;
                        }
                        Player targetPlayer = plugin.getServer().getPlayer(args[2]);
                        OnJoin.getPlayerInformation(targetPlayer).setCoins(OnJoin.getPlayerInformation(targetPlayer).getCoins() + ammount);
                        sendTitle.sendHotbarTitle("#0fd14f", "Du hast erolgreich " + ammount + " Coins an " + targetPlayer.getName() + " gegeben!", p);
                    } else {
                        sendTitle.sendHotbarTitle("#0fd14f", "Du hast nicht die Berechtigung um diesen Befehl auszuführen!", p);
                    }
                }
            } else if (args.length == 0) {
                sendTitle.sendHotbarTitle("#0fd14f", "Du hast " + OnJoin.getPlayerInformation(p).getCoins() + " Coins", p);
            } else {
                sendTitle.sendHotbarTitle("#ofd14f", "Bitte gib gültige argumente an!", p);
            }
        }
        return true;
    }


    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            List<String> tabCompletter = new ArrayList<>();

            if (args.length == 0) {
                tabCompletter.clear();
            } else if (args.length == 1) {
                tabCompletter.clear();
                tabCompletter.add("pay");
                if (p.isOp()) {
                    tabCompletter.add("give");
                    tabCompletter.add("set");
                }
            } else if (args.length == 2) {
                tabCompletter.clear();
            } else if (args.length == 3) {
                tabCompletter.clear();
                for (Player player : plugin.getServer().getOnlinePlayers()){
                    tabCompletter.add(p.getName());
                }
            }

            return tabCompletter;
        } else {
            return null;
        }
    }
}
