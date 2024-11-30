package de.epaxgaming.blockbreakers.listeners;

import de.epaxgaming.blockbreakers.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import de.epaxgaming.blockbreakers.listeners.onJoin.*;
import static org.bukkit.Material.*;

public class onClick implements Listener {


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        if (event.getView().getTitle().equals("Shop")) {

            event.setCancelled(true);

        }
        if (event.getView().getTitle().equals("Help")) {

            event.setCancelled(true);

        }

        if(event.getView().getTitle().equals("ToolShop")){
            event.setCancelled(true);
        }

            Player p = (Player) event.getWhoClicked();
            Inventory clickedInventory = event.getClickedInventory();


            int currentCoins = onJoin.getPlayerInformation(p).getCoins();




            int slot = event.getRawSlot();
            if (slot == 53) {
                p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
                if (event.getView().getTitle().equals("Shop")) {


                    event.getWhoClicked().closeInventory();
                }
            } else if (slot == 11) {
                p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
                if (event.getView().getTitle().equals("Shop")) {

                    Inventory ToolShop = Bukkit.createInventory(null, 9 * 6, "ToolShop");
                    ToolShop.setItem(11, new ItemBuilder(DIAMOND_SWORD).setDisplayname("§7Tools").build());
                    ItemStack black = new ItemStack(BLACK_STAINED_GLASS_PANE);
                    for (int i = 0; i < 9 * 6; i++) {
                        ToolShop.setItem(i, new ItemBuilder(DIAMOND_SWORD).setDisplayname("§7Tools").build());
                    }
                    ItemStack i2 = new ItemStack(WOODEN_SWORD);
                    ItemMeta m2 = i2.getItemMeta();
                    m2.setDisplayName("WoddenSword");
                    List<String> lore = new ArrayList<>();
                    lore.add("§7Price §2 100$");
                    lore.add("§7Rightclick to Buy !");
                    m2.setLore(lore);


                    i2.setItemMeta(m2);
                    ToolShop.setItem(0, i2);
                    ItemStack i4 = new ItemStack(STONE_SWORD);
                    ItemMeta m4 = i4.getItemMeta();
                    m2.setDisplayName("StoneSword");
                    List<String> lore1 = new ArrayList<>();
                    lore1.add("§7Price §2200$");
                    lore1.add("§7Rightclick to Buy !");
                    m4.setLore(lore1);
                    i4.setItemMeta(m4);



                    ItemStack i6 = new ItemStack(GOLDEN_SWORD);
                    ItemMeta m6 = i6.getItemMeta();
                    m6.setDisplayName("GoldSword");
                    List<String> lore2 = new ArrayList<>();
                    lore2.add("§7Price §2300$");
                    lore2.add("§7Rightclick to Buy !");
                    m6.setLore(lore2);
                    i6.setItemMeta(m6);
                    ToolShop.setItem(2, i6);
                    ItemStack i7 = new ItemStack(IRON_SWORD);
                    ItemMeta m7 = i7.getItemMeta();

                    List<String> lore3 = new ArrayList<>();
                    lore3.add("§7Price §2400$");
                    lore3.add("§7Rightclick to Buy !");
                    m7.setLore(lore3);
                    i7.setItemMeta(m7);
                    ToolShop.setItem(3, i7);

                    ItemStack i8 = new ItemStack(DIAMOND_SWORD);
                    ItemMeta m8 = i8.getItemMeta();

                    List<String> lore4 = new ArrayList<>();
                    lore4.add("§7Price §2500$");
                    lore4.add("§7Rightclick to Buy !");
                    m8.setLore(lore4);
                    i8.setItemMeta(m8);
                    ToolShop.setItem(4, i8);

                    ItemStack i9 = new ItemStack(NETHERITE_SWORD);
                    ItemMeta m9 = i9.getItemMeta();

                    List<String> lore5 = new ArrayList<>();
                    lore5.add("§7Price §21000$");
                    lore5.add("§7Rightclick to Buy !");
                    m9.setLore(lore5);
                    i9.setItemMeta(m9);
                    ToolShop.setItem(5, i9);


                    ItemStack custom1 = new ItemStack(NETHERITE_SWORD);
                    ItemMeta custom1m = custom1.getItemMeta();
                    custom1m.setCustomModelData(1);
                    custom1m.setDisplayName("PilzSchwert");
                    List<String> lore6 = new ArrayList<>();
                    lore6.add("§7Price §2100.000$");
                    lore6.add("§7Rightclick to Buy !");
                    custom1m.setLore(lore6);
                    custom1.setItemMeta(custom1m);
                    ToolShop.setItem(6, custom1);
                    ItemStack custom2 = new ItemStack(NETHERITE_SWORD);
                    ItemMeta custom2m = custom1.getItemMeta();

                    List<String> lore7 = new ArrayList<>();
                    custom2m.setDisplayName("CUSTOM_2");
                    lore7.add("§7Price §21.100.000$");
                    lore7.add("§7Rightclick to Buy !");
                    custom2m.setLore(lore7);
                    custom2m.setCustomModelData(4);
                    custom2.setItemMeta(custom2m);
                    ItemStack custom3 = new ItemStack(NETHERITE_SWORD);
                    ItemMeta custom3m = custom3.getItemMeta();

                    List<String> lore8 = new ArrayList<>();
                    custom3m.setDisplayName("CUSTOM_3");
                    lore8.add("§7Price §225.000.000$");
                    lore8.add("§7Rightclick to Buy !");
                    custom3m.setLore(lore8);
                    custom3m.setCustomModelData(1);
                    custom3.setItemMeta(custom3m);
                    ToolShop.setItem(7, custom3);

                    ItemStack i5 = new ItemStack(BARRIER);
                    ItemMeta m5 = i5.getItemMeta();
                    m5.setDisplayName("§4Back");

                    i5.setItemMeta(m5);
                    ToolShop.setItem(1, i4);
                    ToolShop.setItem(7, custom2);
                    ToolShop.setItem(8, custom3);
                    ToolShop.setItem(2, i6);
                    ToolShop.setItem(53, i5);


                    ItemStack pi1 = new ItemStack(WOODEN_PICKAXE);
                    ItemMeta p1 = pi1.getItemMeta();
                    p1.setDisplayName("WoodemPickaxe");
                    List<String> pic = new ArrayList<>();
                    pic.add("§7Price §2 100$");
                    pic.add("§7Rightclick to Buy !");
                    p1.setLore(pic);


                    pi1.setItemMeta(p1);
                    ToolShop.setItem(9, pi1);

                    ItemStack pi2 = new ItemStack(STONE_PICKAXE);
                    ItemMeta p2 = pi2.getItemMeta();
                    p2.setDisplayName("StonePickaxe ");
                    List<String> pic1 = new ArrayList<>();
                    pic1.add("§7Price §2200$");
                    pic1.add("§7Rightclick to Buy !");
                    pi2.setLore(pic1);
                    pi2.setItemMeta(p2);
                    ToolShop.setItem(10, pi2);


                    ItemStack pi3 = new ItemStack(GOLDEN_PICKAXE);
                    ItemMeta p3 = pi3.getItemMeta();
                    p3.setDisplayName("GoldPixkaxe");
                    List<String> pic2 = new ArrayList<>();
                    pic2.add("§7Price §2300$");
                    pic2.add("§7Rightclick to Buy !");
                    p3.setLore(pic2);
                    pi3.setItemMeta(p3);
                    ToolShop.setItem(11, pi3);

                    ItemStack pi4 = new ItemStack(IRON_PICKAXE);
                    ItemMeta p4 = pi4.getItemMeta();

                    List<String> pic3 = new ArrayList<>();
                    pic3.add("§7Price §2400$");
                    pic3.add("§7Rightclick to Buy !");
                    p4.setLore(pic3);
                    pi3.setItemMeta(p3);
                    ToolShop.setItem(12, pi4);

                    ItemStack pi5 = new ItemStack(DIAMOND_PICKAXE);
                    ItemMeta p5 = pi5.getItemMeta();

                    List<String> pic4 = new ArrayList<>();
                    pic4.add("§7Price §2500$");
                    pic4.add("§7Rightclick to Buy !");
                    p5.setLore(pic4);
                    pi4.setItemMeta(p5);
                    ToolShop.setItem(13, pi5);

                    ItemStack pi6 = new ItemStack(NETHERITE_PICKAXE);
                    ItemMeta p6 = pi6.getItemMeta();

                    List<String> pic5 = new ArrayList<>();
                    pic5.add("§7Price §21000$");
                    pic5.add("§7Rightclick to Buy !");
                    pi6.setLore(pic5);
                    pi6.setItemMeta(p6);
                    ToolShop.setItem(14, pi6);


                    ItemStack custom1pi = new ItemStack(NETHERITE_PICKAXE);
                    ItemMeta custom1m1 = custom1pi.getItemMeta();
                    custom1m1.setDisplayName("CUSTOM_1");
                    List<String> cupi1 = new ArrayList<>();
                    lore6.add("§7Price §2100.000$");
                    lore6.add("§7Rightclick to Buy !");
                    custom1m1.setLore(cupi1);
                    custom1pi.setItemMeta(custom1m);
                    ToolShop.setItem(15, custom1pi);

                    ItemStack custom2pi = new ItemStack(NETHERITE_PICKAXE);
                    ItemMeta custom2m2 = custom1.getItemMeta();

                    List<String> cupi2 = new ArrayList<>();
                    custom2m2.setDisplayName("CUSTOM_2");
                    cupi2.add("§7Price §21.100.000$");
                    cupi2.add("§7Rightclick to Buy !");
                    custom2m2.setLore(cupi2);

                    custom2pi.setItemMeta(custom2m2);
                    ToolShop.setItem(16, custom2pi);
                    ItemStack custom3pi = new ItemStack(NETHERITE_PICKAXE);
                    ItemMeta custom3m3 = custom3pi.getItemMeta();


                    List<String> pic3cu = new ArrayList<>();
                    custom3m3.setDisplayName("CUSTOM_3");
                    pic3cu.add("§7Price §225.000.000$");
                    pic3cu.add("§7Rightclick to Buy !");
                    custom3m3.setLore(lore8);
                    custom3m3.setCustomModelData(1);
                    custom3.setItemMeta(custom3m);
                    ToolShop.setItem(17, custom3pi);

                    ItemStack ax1 = new ItemStack(WOODEN_AXE);
                    ItemMeta am1 = ax1.getItemMeta();
                    am1.setDisplayName("WoodenAxe");
                    List<String> axe = new ArrayList<>();
                    axe.add("§7Price §2 100$");
                    axe.add("§7Rightclick to Buy !");
                    am1.setLore(axe);


                    pi1.setItemMeta(am1);
                    ToolShop.setItem(18, ax1);

                    ItemStack ax2 = new ItemStack(STONE_AXE);
                    ItemMeta am2 = ax2.getItemMeta();
                    am2.setDisplayName("StoneAxe ");
                    List<String> axe2 = new ArrayList<>();
                    axe2.add("§7Price §2200$");
                    axe2.add("§7Rightclick to Buy !");
                    pi2.setLore(axe2);
                    pi2.setItemMeta(am2);
                    ToolShop.setItem(19, ax2);


                    ItemStack ax3 = new ItemStack(GOLDEN_AXE);
                    ItemMeta am3 = ax3.getItemMeta();
                    am3.setDisplayName("GoldAxe");
                    List<String> axe3 = new ArrayList<>();
                    axe3.add("§7Price §2300$");
                    axe3.add("§7Rightclick to Buy !");
                    am3.setLore(axe3);
                    ax3.setItemMeta(am3);
                    ToolShop.setItem(20, ax3);

                    ItemStack ax4 = new ItemStack(IRON_AXE);
                    ItemMeta am4 = ax4.getItemMeta();

                    List<String> axe4 = new ArrayList<>();
                    axe4.add("§7Price §2400$");
                    axe4.add("§7Rightclick to Buy !");
                    ax4.setLore(axe4);
                    ax4.setItemMeta(am4);
                    ToolShop.setItem(21, ax4);

                    ItemStack ax5 = new ItemStack(DIAMOND_AXE);
                    ItemMeta am5 = ax5.getItemMeta();

                    List<String> axe5 = new ArrayList<>();
                    axe5.add("§7Price §2500$");
                    axe5.add("§7Rightclick to Buy !");
                    ax5.setLore(axe5);
                    pi4.setItemMeta(am5);
                    ToolShop.setItem(22, ax5);

                    ItemStack ax6 = new ItemStack(NETHERITE_PICKAXE);
                    ItemMeta am6 = ax6.getItemMeta();

                    List<String> axe6 = new ArrayList<>();
                    axe6.add("§7Price §21000$");
                    axe6.add("§7Rightclick to Buy !");
                    ax6.setLore(axe6);
                    ax6.setItemMeta(am6);
                    ToolShop.setItem(23, ax6);


                    ItemStack customaxe1 = new ItemStack(NETHERITE_AXE);
                    ItemMeta cam = customaxe1.getItemMeta();
                    cam.setDisplayName("CUSTOM_1");
                    List<String> ca1 = new ArrayList<>();
                    ca1.add("§7Price §2100.000$");
                    ca1.add("§7Rightclick to Buy !");
                    cam.setLore(ca1);
                    customaxe1.setItemMeta(cam);
                    ToolShop.setItem(24, custom1pi);

                    ItemStack customaxe2 = new ItemStack(NETHERITE_PICKAXE);
                    ItemMeta cam2 = customaxe2.getItemMeta();

                    List<String> ca2 = new ArrayList<>();
                    cam2.setDisplayName("CUSTOM_2");
                    ca2.add("§7Price §21.100.000$");
                    ca2.add("§7Rightclick to Buy !");
                    cam2.setLore(ca2);

                    custom2pi.setItemMeta(cam2);
                    ToolShop.setItem(25, customaxe2);

                    ItemStack customaxe3= new ItemStack(NETHERITE_PICKAXE);
                    ItemMeta cam3 = customaxe3.getItemMeta();

                    List<String> ca3 = new ArrayList<>();
                    cam3.setDisplayName("CUSTOM_3");
                    ca3.add("§7Price §225.000.000$");
                    ca3.add("§7Rightclick to Buy !");
                    cam3.setLore(ca3);

                    customaxe3.setItemMeta(cam3);
                    ToolShop.setItem(26, customaxe3);


                    event.getWhoClicked().openInventory(ToolShop);
                    p.getOpenInventory();
                }
            }


            if (slot == 53) {

                if (event.getView().getTitle().equals("ToolShop")) {

                    event.getWhoClicked().closeInventory();
                    Inventory inventory = Bukkit.createInventory(null, 9 * 6, "Shop");
                    ItemStack black = new ItemStack(BLACK_STAINED_GLASS_PANE);
                    for (int i = 0; i < 9 * 6; i++) {
                        inventory.setItem(i, black);
                    }
                    ItemStack i2 = new ItemStack(DIAMOND_SWORD);
                    ItemMeta m2 = i2.getItemMeta();
                    m2.setDisplayName("§7Tools");
                    i2.setItemMeta(m2);
                    ItemStack i1 = new ItemStack(BARRIER);
                    ItemMeta m1 = i1.getItemMeta();
                    m1.setDisplayName("§4Close");
                    i1.setItemMeta(m1);
                    inventory.setItem(53, i1);
                    inventory.setItem(11, i2);
                    p.openInventory(inventory);
                }
            }

            if (slot == 0) {

                if (event.getView().getTitle().equals("ToolShop")) {

                    if (currentCoins > 100) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        currentCoins -= 100;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);
                        ItemStack woddensword = new ItemStack(WOODEN_SWORD);
                        p.getInventory().addItem(woddensword);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Woddensword Gekauft!");
                    }
                } else {
                    p.sendMessage("§cBlockBreakers - Du hast nicht genug Geld!");
                }
            }
            if (slot == 1) {

                if (event.getView().getTitle().equals("ToolShop")) {

                    if (currentCoins > 200) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(STONE_SWORD);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 200;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Stonesword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }
                }


            }
            if (slot == 2) {

                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 300) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(GOLDEN_SWORD);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 300;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Goldsword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 3) {

                if (event.getView().getTitle().equals("ToolShop")) {

                    if (currentCoins > 400) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(IRON_SWORD);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 400;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Ironsword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast  nicht genug Geld!");
                    }


                }

            }

            if (slot == 4) {

                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 500) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(DIAMOND_SWORD);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 500;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Diamondsword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }

                }


            }


            if (slot == 5) {

                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 1000) {
                        ItemStack Stonesword = new ItemStack(NETHERITE_SWORD);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 1000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Netheritessword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }

            if (slot == 6) {

                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 100000) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 2.0f, 12.0f);
                        ItemStack Stonesword = new ItemStack(NETHERITE_SWORD);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 100000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Netheritesword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }

            if (slot == 7) {

                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 1100000) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(NETHERITE_SWORD);
                        ItemMeta sword = Stonesword.getItemMeta();
                        sword.setMaxStackSize(1);


                        sword.addEnchant(Enchantment.SHARPNESS, 100, true);

                        Stonesword.setItemMeta(sword);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 1000000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Diamondsword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }

            if (slot == 8) {


                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 25000000) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(NETHERITE_SWORD);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 25000000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich Ein Netheritesword Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }
            }

            if (slot == 9) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 100) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(WOODEN_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 100;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Holzspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 10) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 200) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(STONE_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 200;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Steinspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }

            if (slot == 11) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 300) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(GOLDEN_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 300;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Goldspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 12) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 400) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(IRON_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 400;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Eisenspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 13) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 500) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(DIAMOND_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 500;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Diaspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 14) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 1000) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(NETHERITE_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 1000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eineNetheritespitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 15) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 100000) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(NETHERITE_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 100000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Customspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 16) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 100000) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(NETHERITE_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 100000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Customspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }
            if (slot == 17) {
                if (event.getView().getTitle().equals("ToolShop")) {
                    if (currentCoins > 100000) {
                        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                        ItemStack Stonesword = new ItemStack(NETHERITE_PICKAXE);
                        p.getInventory().addItem(Stonesword);
                        currentCoins -= 100000;
                        onJoin.getPlayerInformation(p).setCoins(currentCoins);

                        p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Customspitzhacke Gekauft!");
                    } else {
                        p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                    }


                }

            }

        if (slot == 18) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 100) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(WOODEN_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 100;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine HolzAxe Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }
        if (slot == 19) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 200) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(STONE_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 200;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Steinatzt Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }

        if (slot == 20) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 300) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(GOLDEN_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 300;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine GoldAxt Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }
        if (slot == 21) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 400) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(IRON_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 400;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine EisenAzt Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }
        if (slot == 22) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 500) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(DIAMOND_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 500;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine DiamandAxt Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }
        if (slot == 23) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 1000) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(NETHERITE_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 1000;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine NetheriteAzt Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }
        if (slot == 23) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 100000) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(NETHERITE_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 100000;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine CustomAXt Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }
        if (slot == 24) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 100000) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(NETHERITE_AXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 100000;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Customaxt Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }
        if (slot == 25) {
            if (event.getView().getTitle().equals("ToolShop")) {
                if (currentCoins > 100000) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f);
                    ItemStack Stonesword = new ItemStack(NETHERITE_PICKAXE);
                    p.getInventory().addItem(Stonesword);
                    currentCoins -= 100000;
                    onJoin.getPlayerInformation(p).setCoins(currentCoins);

                    p.sendMessage("§cBlockBreakers - §7Sie habe Erfolgreich eine Customspitzhacke Gekauft!");
                } else {
                    p.sendMessage("§cBlockBreakers - §7 Du hast nicht genug Geld!");
                }


            }

        }

        }
    }
