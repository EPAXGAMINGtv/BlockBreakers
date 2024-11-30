package de.epaxgaming.blockbreakers.playerInfo;

public class playerInformation {

    private int minedBlocks;
    private int coins;
    private boolean inv;
    private int level;
    private String rang;

    public playerInformation(int minedBlocks, int coins, int level, String rang ,boolean ininv) {
        this.minedBlocks = minedBlocks;
        this.coins = coins;
        this.inv = ininv;
        this.level = level;
        this.rang = rang;
    }

    public int getMinedBlocks() {
        return minedBlocks;
    }

    public int getCoins() {
        return coins;
    }
    public boolean getininv() {
        return inv;
    }

    public int getLevel() {
        return level;
    }

    public String getRang() {
        return rang;
    }

    public void setMinedBlocks(int minedBlocks) {
        this.minedBlocks = minedBlocks;
    }
    public void setMinedBlocks(boolean inv) {
        this.inv = inv;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
}
