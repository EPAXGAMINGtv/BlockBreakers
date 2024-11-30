package de.epaxgaming.blockbreakers.tasks;

import de.epaxgaming.blockbreakers.BlockBreakers;
import de.epaxgaming.blockbreakers.coustomFile.playerInfoFile;
import de.epaxgaming.blockbreakers.listeners.onJoin;
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
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".coins", onJoin.getPlayerInformation(p).getininv());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".coins", onJoin.getPlayerInformation(p).getCoins());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".level", onJoin.getPlayerInformation(p).getLevel());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".rang", onJoin.getPlayerInformation(p).getRang());
            playerInfoFile.get().set("Players." + p.getUniqueId() + ".minedBlocks", onJoin.getPlayerInformation(p).getMinedBlocks());
        }
        playerInfoFile.save();
        playerInfoFile.reload();
    }
}
