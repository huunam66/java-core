package com.set_and_map.StockMap;

public class Main {
    public static void main(String[] args) {
        StockList stockList = new StockList();

        for (int i = 1; i <= 10; i++) {
            StockItem stockItem = new StockItem("Item " + i, i * 12.3, i * 123);
            stockList.addStockItem(stockItem);
        }

        System.out.println(stockList);
    }
}
