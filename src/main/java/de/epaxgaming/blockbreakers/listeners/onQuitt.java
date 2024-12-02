package de.epaxgaming.blockbreakers.listeners;

import de.epaxgaming.blockbreakers.coustomFile.playerInfoFile;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuitt implements Listener {

    @EventHandler
    public void onQuitt(PlayerQuitEvent e){
        Player p = e.getPlayer();


        playerInfoFile.get().set("Players." + p.getUniqueId() + ".coins", OnJoin.getPlayerInformation(p).getCoins());
        playerInfoFile.get().set("Players." + p.getUniqueId() + ".level", OnJoin.getPlayerInformation(p).getLevel());
        playerInfoFile.get().set("Players." + p.getUniqueId() + ".rang", OnJoin.getPlayerInformation(p).getRang());
        playerInfoFile.get().set("Players." + p.getUniqueId() + ".minedBlocks", OnJoin.getPlayerInformation(p).getMinedBlocks());

        playerInfoFile.save();
        playerInfoFile.reload();
    }

}
