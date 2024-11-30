package de.epaxgaming.blockbreakers.npc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SpawnNPCTabCompleter implements TabCompleter {

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        List<String> completions = new ArrayList<>();


        if (sender.isOp()) {
            if (args.length == 1) {
                completions.add("buildworld");
                completions.add("farmworld");
                completions.add("shop");
                completions.add("help");
            }
        }

        return completions;
    }
}
