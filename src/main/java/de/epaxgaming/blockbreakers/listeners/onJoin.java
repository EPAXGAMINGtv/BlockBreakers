package de.epaxgaming.blockbreakers.listeners;

import de.epaxgaming.blockbreakers.coustomFile.playerInfoFile;
import de.epaxgaming.blockbreakers.playerInfo.playerInformation;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import de.epaxgaming.blockbreakers.listeners.inventrycloese;

import java.util.HashMap;
public class onJoin implements Listener {

    static HashMap<Player, playerInformation> playerInformations = new HashMap<>();

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player p = e.getPlayer();
        p.sendMessage("");

        if (!p.hasPlayedBefore()) {
            playerInformation playerInformation = new playerInformation(0, 0, 1, "Newbie",false);
            playerInformations.put(p, playerInformation);
        } else {
            playerInformation playerInformation = new playerInformation(playerInfoFile.get().getInt("Players." + p.getUniqueId() + ".minedBlocks"), playerInfoFile.get().getInt("Players." + p.getUniqueId() + ".coins"), playerInfoFile.get().getInt("Players." + p.getUniqueId() + ".level"), playerInfoFile.get().getString("Players." + p.getUniqueId() + ".rang"),playerInfoFile.get().getBoolean("Players." + p.getUniqueId() + ".ininv"));
            playerInformations.put(p, playerInformation);
        }

    }

    public static playerInformation getPlayerInformation(Player p){
        return playerInformations.get(p);
    }


}
