package de.epaxgaming.blockbreakers.Spawn;

import de.epaxgaming.blockbreakers.BlockBreakers;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawn implements CommandExecutor {

    private final BlockBreakers plugin;

    public SetSpawn(BlockBreakers plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("setspawn")) {
            if (!(sender instanceof Player p)) return false;

            Location location = p.getLocation();

            plugin.spawnConfig.set("spawn.world", location.getWorld().getName());
            plugin.spawnConfig.set("spawn.x", location.getX());
            plugin.spawnConfig.set("spawn.y", location.getY());
            plugin.spawnConfig.set("spawn.z", location.getZ());
            plugin.spawnConfig.set("spawn.yaw", location.getYaw());
            plugin.spawnConfig.set("spawn.pitch", location.getPitch());

            plugin.saveConfig();

            p.sendMessage("§aSpawn wurde gesetzt!");
            return true;
        }
        return false;
    }
}