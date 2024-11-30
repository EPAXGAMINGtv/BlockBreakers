package de.epaxgaming.blockbreakers.Spawn;

import de.epaxgaming.blockbreakers.BlockBreakers;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Spawn implements CommandExecutor {

    private final BlockBreakers plugin;

    public Spawn(BlockBreakers plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player p)) return false;

        p.teleport(getSpawnLocation());
        p.sendMessage(plugin.messagePrefix + "Du wurdest zum Spawn teleportiert.");
        return false;
    }

    public Location getSpawnLocation() {
        String worldName = plugin.spawnConfig.getString("spawn.world");
        if (worldName == null) {
            return null;
        }

        double x = plugin.spawnConfig.getDouble("spawn.x");
        double y = plugin.spawnConfig.getDouble("spawn.y");
        double z = plugin.spawnConfig.getDouble("spawn.z");
        float yaw = (float) plugin.spawnConfig.getDouble("spawn.yaw");
        float pitch = (float) plugin.spawnConfig.getDouble("spawn.pitch");

        return new Location(Bukkit.getWorld(worldName), x, y, z, yaw, pitch);
    }
}
