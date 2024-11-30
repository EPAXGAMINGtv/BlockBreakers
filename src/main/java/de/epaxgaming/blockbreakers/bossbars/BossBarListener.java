package de.epaxgaming.blockbreakers.bossbars;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.boss.BossBar;
import de.epaxgaming.blockbreakers.listeners.onJoin;


public class BossBarListener implements Listener {

    private BossBar bossBar;

    // Erstelle die BossBar und füge den Spieler hinzu
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        createBossBar(player);
    }

    // Entferne den Spieler von der BossBar beim Verlassen
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        removeBossBar(player);
    }

    // Aktualisiere die BossBar, wenn ein Block abgebaut wird
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        // Beispiel: Fortschritt auf 0.5 setzen, hier kannst du deine Logik hinzufügen
        updateBossBar(player, 0.5);
    }

    // Methode zum Erstellen der BossBar
    private void createBossBar(Player player) {

        bossBar = Bukkit.createBossBar(ChatColor.RED + "BlockBreakers", BarColor.RED, BarStyle.SEGMENTED_6, BarFlag.DARKEN_SKY);

        bossBar.addPlayer(player);
        bossBar.setProgress(1.0); // Setze den Fortschritt auf 100%
        bossBar.setVisible(true);
    }

    // Methode zum Entfernen der BossBar
    private void removeBossBar(Player player) {
        if (bossBar != null) {
            bossBar.removePlayer(player);
        }
    }

    // Methode zum Aktualisieren des Fortschritts der BossBar
    public void updateBossBar(Player player, double progress) {
        if (bossBar != null && bossBar.getPlayers().contains(player)) {
            bossBar.setProgress(progress);
        }
    }
}
