package de.epaxgaming.blockbreakers.scoreboards;

import de.epaxgaming.blockbreakers.BlockBreakers;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.DisplaySlot;
import de.epaxgaming.blockbreakers.listeners.OnJoin;

public class ScoreboardListener implements Listener {

    private final BlockBreakers plugin;

    public ScoreboardListener(BlockBreakers plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        createScoreboard(player);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer(); // Korrekte Methode zum Abrufen des Spielers
        // Hier kannst du den Zähler für abgebauten Blöcke erhöhen
        OnJoin.getPlayerInformation(player).getMinedBlocks(); // Beispiel: erhöhe die Anzahl der abgebauten Blöcke
        createScoreboard(player);
    }

    public void createScoreboard(Player player) {
        int minedBlocks = OnJoin.getPlayerInformation(player).getMinedBlocks();
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = manager.getNewScoreboard();

        // Erstelle ein Objective (Ziel) für das Scoreboard
        Objective objective = scoreboard.registerNewObjective("example", "dummy", ChatColor.RED + "BlockBreakers");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        // Füge Punkte hinzu
        Score score1 = objective.getScore("Minnedblocks:");
        score1.setScore(minedBlocks); // Setze den Wert auf die abgebauten Blöcke

        Score score2 = objective.getScore("coins:");
        score2.setScore(OnJoin.getPlayerInformation(player).getCoins());
        Score score3 = objective.getScore("Level:");
        score3.setScore(OnJoin.getPlayerInformation(player).getLevel());

        Score score4 = objective.getScore("");

        objective.getScore("").setScore(0);
        objective.getScore("BlockBreakers.net").setScore(0);


        // Setze das Scoreboard für den Spieler
        player.setScoreboard(scoreboard);
    }

    public void reloadScoreboard(Player player) {
        // Hier kannst du die Logik für das Aktualisieren des Scoreboards implementieren
    }
}
