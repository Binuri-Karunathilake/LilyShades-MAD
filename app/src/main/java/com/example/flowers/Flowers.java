package com.example.flowers;

public class Flowers{

    private String bouquetName;
    private String bouquetCategory;
    private double costForBouquet;
    private double marketPrice;

    public Flowers() {
    }

    public String getBouquetName() {
        return bouquetName;
    }

    public void setBouquetName(String bouquetName) {
        this.bouquetName = bouquetName;
    }

    public String getBouquetCategory() {
        return bouquetCategory;
    }

    public void setBouquetCategory(String bouquetCategory) {
        this.bouquetCategory = bouquetCategory;
    }

    public double getCostForBouquet() {
        return costForBouquet;
    }

    public void setCostForBouquet(double costForBouquet) {
        this.costForBouquet = costForBouquet;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }
}
