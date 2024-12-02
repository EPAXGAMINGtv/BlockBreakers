package de.epaxgaming.blockbreakers.listeners;

import de.epaxgaming.blockbreakers.cahtDesign.sendTitle;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class onBlockBreak implements Listener {
    public int COALORE = 5;
    public int IRONORE = 5;
    public int COOPERORE = 3;
    public int GOLDORE = 6;
    public int EMMERALDORE = 7;
    public int LAPISORE = 3;
    public int DIAMONDORE = 10;
    public int DEEPSLATECOALORE = 100;
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        Material breakedBlock = e.getBlock().getType();
        int currentCoins = OnJoin.getPlayerInformation(p).getCoins();
        int minedBlocks = OnJoin.getPlayerInformation(p).getMinedBlocks();
        minedBlocks++;


        if (breakedBlock == Material.COAL_ORE) {
            currentCoins += COALORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+COALORE+" Coins)!", p);
        } else if (breakedBlock == Material.IRON_ORE || breakedBlock == Material.DEEPSLATE_IRON_ORE) {
            currentCoins += IRONORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+IRONORE+" Coins)!", p);
        } else if (breakedBlock == Material.COPPER_ORE || breakedBlock == Material.DEEPSLATE_COPPER_ORE) {
            currentCoins += COOPERORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+COOPERORE+" Coins)!", p);
        } else if (breakedBlock == Material.GOLD_ORE || breakedBlock == Material.DEEPSLATE_GOLD_ORE) {
            currentCoins += GOLDORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+GOLDORE+" Coins)!", p);
        } else if (breakedBlock == Material.EMERALD_ORE || breakedBlock == Material.DEEPSLATE_EMERALD_ORE) {
            currentCoins += EMMERALDORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+EMMERALDORE, p);
        } else if (breakedBlock == Material.LAPIS_ORE || breakedBlock == Material.DEEPSLATE_LAPIS_ORE) {
            currentCoins += LAPISORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+LAPISORE+" Coins)!", p);
        } else if (breakedBlock == Material.DIAMOND_ORE || breakedBlock == Material.DEEPSLATE.DIAMOND_ORE) {
            currentCoins += DIAMONDORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+DIAMONDORE+" Coins)!", p);
        } else if (breakedBlock == Material.DEEPSLATE_COAL_ORE) {
            currentCoins += DEEPSLATECOALORE;
            sendTitle.sendHotbarTitle("#0fd14f", "Du hast ein " + breakedBlock.name() + " abbgebaut (+"+DEEPSLATECOALORE+" Coins)!", p);
        } else {
            currentCoins++;
            sendTitle.sendHotbarTitle("#0fd14f", "+1 Coins", p);
        }


        OnJoin.getPlayerInformation(p).setMinedBlocks(minedBlocks);
        OnJoin.getPlayerInformation(p).setCoins(currentCoins);
        OnJoin.getPlayerInformation(p).getMinedBlocks();
        OnJoin.getPlayerInformation(p).getLevel();
        if (minedBlocks ==100){
            COALORE+= 5;
            IRONORE += 5;
            COOPERORE += 3;
            GOLDORE += 6;
            EMMERALDORE += 7;
            LAPISORE += 3;
            DIAMONDORE += 10;
            DEEPSLATECOALORE += 100;

            p.sendMessage("§cBlockBreakers - "+"§7Du Boostest den ganzen sever !");
            sendTitle.sendHotbarTitle("#0fd14f", "+1000 coins  wegen level up !", p);
            currentCoins+= 1000;
            OnJoin.getPlayerInformation(p).setCoins(currentCoins);
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);

            OnJoin.getPlayerInformation(p).setLevel(1);
        }
        if (minedBlocks ==200){
            p.sendMessage("§cBlockBreakers - "+"§7Du Boostest den ganzen sever !");
            sendTitle.sendHotbarTitle("#0fd14f", "+1000 coins wegen level up !", p);
            COALORE+= 10;
            IRONORE += 10;
            COOPERORE += 6;
            GOLDORE += 12;
            EMMERALDORE += 14;
            LAPISORE += 6;
            DIAMONDORE += 20;
            DEEPSLATECOALORE += 200;
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 1.0f, 1.0f);
            currentCoins+= 2000;
            OnJoin.getPlayerInformation(p).setCoins(currentCoins);
            OnJoin.getPlayerInformation(p).setLevel(2);
        }
        if (minedBlocks ==300){
            p.sendMessage("§cBlockBreakers - "+"§7Du Boostest den ganzen sever !");
            sendTitle.sendHotbarTitle("#0fd14f", "+1000 coins wegen level up !", p);
            COALORE+= 20;
            IRONORE += 20;
            COOPERORE += 12;
            GOLDORE += 24;
            EMMERALDORE += 21;
            LAPISORE += 12;
            DIAMONDORE += 30;
            DEEPSLATECOALORE += 300;
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 1.0f, 1.0f);
            currentCoins+= 3000;
            OnJoin.getPlayerInformation(p).setCoins(currentCoins);
            OnJoin.getPlayerInformation(p).setLevel(3);
        }
        if (minedBlocks ==400){
            p.sendMessage("§cBlockBreakers - "+"§7Du Boostest den ganzen sever !");
            sendTitle.sendHotbarTitle("#0fd14f", "+1000 coins wegen level up !", p);
            COALORE+= 40;
            IRONORE += 40;
            COOPERORE += 24;
            GOLDORE += 48;
            EMMERALDORE += 42;
            LAPISORE += 30;
            DIAMONDORE += 100;
            DEEPSLATECOALORE += 500;
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 1.0f, 1.0f);
            currentCoins+= 4000;
            OnJoin.getPlayerInformation(p).setCoins(currentCoins);
            OnJoin.getPlayerInformation(p).setLevel(4);
        }
        if (minedBlocks ==500){
            p.sendMessage("§cBlockBreakers - "+"§7Du Boostest den ganzen sever !");
            sendTitle.sendHotbarTitle("#0fd14f", "+1000 coins wegen level up !", p);
            COALORE+= 50;
            IRONORE += 50;
            COOPERORE += 30;
            GOLDORE += 60;
            EMMERALDORE += 70;
            LAPISORE += 30;
            DIAMONDORE += 100;
            DEEPSLATECOALORE += 1000;
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 1.0f, 1.0f);
            currentCoins+= 5000;
            OnJoin.getPlayerInformation(p).setCoins(currentCoins);
            OnJoin.getPlayerInformation(p).setLevel(5);
        }
        if (minedBlocks ==1000){
            p.sendMessage("§cBlockBreakers - "+"§7Du Boostest den ganzen sever !");
            sendTitle.sendHotbarTitle("#0fd14f", "+1000 coins wegen level up !", p);
            COALORE+= 500;
            IRONORE += 500;
            COOPERORE += 300;
            GOLDORE += 600;
            EMMERALDORE += 700;
            LAPISORE += 300;
            DIAMONDORE += 1000;
            DEEPSLATECOALORE += 10000;
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 1.0f, 1.0f);
            currentCoins+= 10000;
            OnJoin.getPlayerInformation(p).setCoins(currentCoins);
            OnJoin.getPlayerInformation(p).setLevel(5);
        }}




}

