package de.epaxgaming.blockbreakers.coustomFile;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class playerInfoFile {

    private static File file;
    private static FileConfiguration playerInfoFile;

    public static void setup(){

        file = new File(Bukkit.getServer().getPluginManager().getPlugin("BlockBreakers").getDataFolder(), "playerInformations.yml");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("File konnte nicht erstellt werden!");
            }
        }
        playerInfoFile = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get(){
        return playerInfoFile;
    }

    public static void save(){
        try {
            playerInfoFile.save(file);
        } catch (IOException e) {
            System.out.println("File konnte nicht gespeichert werden!");
        }
    }

    public static void reload(){
        playerInfoFile = YamlConfiguration.loadConfiguration(file);
    }

}
