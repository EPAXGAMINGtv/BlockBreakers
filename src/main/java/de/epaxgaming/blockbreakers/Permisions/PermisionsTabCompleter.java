package de.epaxgaming.blockbreakers.npc;

import de.epaxgaming.blockbreakers.BlockBreakers;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.permissions.Permission;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PermisionsTabCompleter implements TabCompleter {
    private final BlockBreakers plugin;

    public PermisionsTabCompleter(BlockBreakers plugin) {
        this.plugin = plugin;
    }

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        List<String> completions = new ArrayList<>();

        if (sender.isOp()) {
            if (args.length == 1) {
                completions.add("add");
                completions.add("set");
                completions.add("setRank");
                completions.add("RankAddPermision");
            }

            if (args.length == 2) {

                Set<Permission> permissions = Bukkit.getPluginManager().getPermissions();
                for (Permission permission : permissions) {
                    completions.add(permission.getName());
                }
            }
        }

        return completions;
    }
}
