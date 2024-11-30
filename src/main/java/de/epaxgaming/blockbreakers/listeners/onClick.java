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

                    ToolShop.setItem(0, new ItemBuilder(WOODEN_SWORD).setLore("§7Price §2 100$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(1, new ItemBuilder(STONE_SWORD).setLore("§7Price §2 200$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(2, new ItemBuilder(GOLDEN_SWORD).setLore("§7Price §2 300$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(3, new ItemBuilder(IRON_SWORD).setLore("§7Price §2 400$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(4, new ItemBuilder(DIAMOND_SWORD).setLore("§7Price §2 500$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(5, new ItemBuilder(NETHERITE_SWORD).setLore("§7Price §2 1000$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(6, new ItemBuilder(NETHERITE_SWORD).setLore("§7Price §2 100.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_NETHERITE_SWORD_1").build());
                    ToolShop.setItem(7, new ItemBuilder(NETHERITE_SWORD).setLore("§7Price §2 1.100.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_NETHERITE_SWORD_2").build());
                    ToolShop.setItem(8, new ItemBuilder(NETHERITE_SWORD).setLore("§7Price §2 25.000.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_NETHERITE_SWORD_3").build());


                    ToolShop.setItem(9, new ItemBuilder(WOODEN_PICKAXE).setLore("§7Price §2 100$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(10, new ItemBuilder(STONE_PICKAXE).setLore("§7Price §2 200$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(11, new ItemBuilder(GOLDEN_PICKAXE).setLore("§7Price §2 300$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(12, new ItemBuilder(IRON_PICKAXE).setLore("§7Price §2 400$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(13, new ItemBuilder(DIAMOND_PICKAXE).setLore("§7Price §2 500$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(14, new ItemBuilder(NETHERITE_PICKAXE).setLore("§7Price §2 1000$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(15, new ItemBuilder(NETHERITE_PICKAXE).setLore("§7Price §2 100.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_NETHERITE_PICKAXE_1").build());
                    ToolShop.setItem(16, new ItemBuilder(NETHERITE_PICKAXE).setLore("§7Price §2 1.100.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_NETHERITE_PICKAXe_2").build());
                    ToolShop.setItem(17, new ItemBuilder(NETHERITE_PICKAXE).setLore("§7Price §2 25.000.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_NETHERITE_PICKAXE_3").build());


                    ToolShop.setItem(18, new ItemBuilder(WOODEN_AXE).setLore("§7Price §2 100$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(19, new ItemBuilder(STONE_AXE).setLore("§7Price §2 200$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(20, new ItemBuilder(GOLDEN_AXE).setLore("§7Price §2 300$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(21, new ItemBuilder(IRON_AXE).setLore("§7Price §2 400$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(22, new ItemBuilder(DIAMOND_AXE).setLore("§7Price §2 500$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(23, new ItemBuilder(NETHERITE_AXE).setLore("§7Price §2 1000$","§7Rightclick to Buy !").setDisplayname("").build());
                    ToolShop.setItem(24, new ItemBuilder(NETHERITE_AXE).setLore("§7Price §2 100.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_NETHERITE_AXE_1").build());
                    ToolShop.setItem(25, new ItemBuilder(NETHERITE_AXE).setLore("§7Price §2 1.100.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_AXE_SWORD_2").build());
                    ToolShop.setItem(26, new ItemBuilder(NETHERITE_AXE).setLore("§7Price §2 25.000.000$", "§7Rightclick to Buy !").setDisplayname("CUSTOM_AXE_SWORD_3").build());

                    ToolShop.setItem(53, new ItemBuilder(BARRIER).setDisplayname("§4Back").build());


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
