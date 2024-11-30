package de.epaxgaming.blockbreakers.cahtDesign;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.title.Title;
import org.apache.maven.model.CiManagement;
import org.bukkit.entity.Player;

public class sendTitle {

    public static void sendHotbarTitle(String hexCode, String message, Player p){
        MiniMessage mm = MiniMessage.miniMessage();
        Component component =mm.deserialize("<color:" + hexCode + ">" + message);
        p.sendActionBar(component);
    }

}
