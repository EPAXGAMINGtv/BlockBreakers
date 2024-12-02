package de.epaxgaming.blockbreakers.tasks;

import de.epaxgaming.blockbreakers.BlockBreakers;
import de.epaxgaming.blockbreakers.coustomFile.playerInfoFile;
import de.epaxgaming.blockbreakers.listeners.OnJoin;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class safePlayerInformation extends BukkitRunnable {

    BlockBreakers plugin;

    public safePlayerInformation(BlockBreakers plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        for (Player p : plugin.getServer().getOnlinePlayers()){
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".coins", OnJoin.getPlayerInformation(p).getininv());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".coins", OnJoin.getPlayerInformation(p).getCoins());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".level", OnJoin.getPlayerInformation(p).getLevel());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".rang", OnJoin.getPlayerInformation(p).getRang());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".minedBlocks", OnJoin.getPlayerInformation(p).getMinedBlocks());
        }
        playerInfoFile.save();
        playerInfoFile.reload();
    }
}
