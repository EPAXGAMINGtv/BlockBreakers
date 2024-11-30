package de.epaxgaming.blockbreakers;

import de.epaxgaming.blockbreakers.Spawn.SetSpawn;
import de.epaxgaming.blockbreakers.Spawn.Spawn;
import de.epaxgaming.blockbreakers.bossbars.BossBarListener;
import de.epaxgaming.blockbreakers.commands.*;
import de.epaxgaming.blockbreakers.coustomFile.playerInfoFile;
import de.epaxgaming.blockbreakers.essentialscommands.PermisionsAdd;

import de.epaxgaming.blockbreakers.essentialscommands.fly;
import de.epaxgaming.blockbreakers.essentialscommands.gm;
import de.epaxgaming.blockbreakers.listeners.*;
import de.epaxgaming.blockbreakers.menüs.OpenShop;

import de.epaxgaming.blockbreakers.npc.SpawnNPCTabCompleter;
import de.epaxgaming.blockbreakers.npc.spawnnpc;
import de.epaxgaming.blockbreakers.scoreboards.ScoreboardListener;
import de.epaxgaming.blockbreakers.tasks.safePlayerInformation;
import de.epaxgaming.blockbreakers.testcmds.custommodel;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class BlockBreakers extends JavaPlugin {
    public FileConfiguration spawnConfig;
    public String messagePrefix = "§cBlockBreakers §7- ";

    @Override
    public void onEnable() {
        //Events
        if (!getDataFolder().exists()) {
            getDataFolder().mkdir();
        }

        // Lade Berechtigungen beim Start
        for (Player player : getServer().getOnlinePlayers()) {
            loadPermissions(player);
        }
        getServer().getPluginManager().registerEvents(new onClick(this), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new onQuitt(), this);
        getServer().getPluginManager().registerEvents(new onBlockBreak(), this);
        getServer().getPluginManager().registerEvents(new NoDropsListener(), this);
        getServer().getPluginManager().registerEvents(new NoMobBlockstoogle(), this);
        getServer().getPluginManager().registerEvents(new de.epaxgaming.blockbreakers.events.NPCListener(), this);
        getServer().getPluginManager().registerEvents(new ScoreboardListener(this), this);
        getServer().getPluginManager().registerEvents(new BossBarListener(), this);
        //Commands
        //Spawn
        saveDefaultConfig();
        spawnConfig = getConfig();
        getCommand("setspawn").setExecutor(new SetSpawn(this));
        getCommand("spawn").setExecutor(new Spawn(this));

        //andere
        getCommand("money").setExecutor(new money(this));
        getCommand("gm").setExecutor(new gm());
        this.getCommand("level").setExecutor(new level());
        this.getCommand("minnedblocks").setExecutor(new Minnedblocks());

        this.getCommand("shop").setExecutor(new OpenShop());
        this.getCommand("fly").setExecutor(new fly(this));
        this.getCommand("buildworld").setExecutor(new buildworld());
        this.getCommand("Farmwelt").setExecutor(new Famrworld());
        this.getCommand("Farmworld").setExecutor(new Famrworld());
        this.getCommand("test").setExecutor(new custommodel());
        this.getCommand("permisions").setExecutor(new PermisionsAdd());
        this.getCommand("spawnnpc").setExecutor(new spawnnpc());
        this.getCommand("spawnnpc").setTabCompleter(new SpawnNPCTabCompleter());
        this.getCommand("generateworld").setExecutor(new CreateWorld());
        getCommand("enterworld").setExecutor(new EnterWorld());
        //Files
        playerInfoFile.setup();
        playerInfoFile.get().options().copyDefaults(true);
        playerInfoFile.save();        //Tasks
        safePlayerInformation safePlayerInformation = new safePlayerInformation(this);
        safePlayerInformation.runTaskTimer(this, 1800000, 1800000);
    }

    @Override
    public void onDisable() {
        saveConfig();
        getLogger().info("SpawnPlugin has been disabled!");
    }

    public void savePermissions(Player player, String permission) {
        File file = new File(getDataFolder(), "permissions.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        config.set(player.getUniqueId().toString() + "." + permission, true);
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadPermissions(Player player) {
        File file = new File(getDataFolder(), "permissions.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        if (config.contains(player.getUniqueId().toString())) {
            for (String key : config.getConfigurationSection(player.getUniqueId().toString()).getKeys(false)) {
                player.addAttachment(this, key, true);
            }
        }
    }
}
