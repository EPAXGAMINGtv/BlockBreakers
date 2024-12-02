package de.epaxgaming.blockbreakers.util;

import de.epaxgaming.blockbreakers.listeners.OnJoin;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BuyBuilder {



    public BuyBuilder(Player p) {
        int coins = OnJoin.getPlayerInformation(p).getCoins();

    }

    public BuyBuilder setCash(Player p, int addcoins) {
        int coins = OnJoin.getPlayerInformation(p).getCoins();
        coins -= addcoins;
        return this;
    }
    public BuyBuilder addInInv(Player p , Inventory inv,ItemStack item) {
        p.getInventory().addItem(item);

        return this;
    }

    public BuyBuilder notEnoughCash(Player p, int cash) {
        int coins = OnJoin.getPlayerInformation(p).getCoins();
        if (coins > cash){
            p.sendMessage("§cBlockBreakers §7- Nicht genung Geld!");
        }
        return this;
    }

    public BuyBuilder playSound(Player p, Sound sound) {
        p.playSound(p.getLocation(),sound,1f,1f);
        return this;
    }


}
