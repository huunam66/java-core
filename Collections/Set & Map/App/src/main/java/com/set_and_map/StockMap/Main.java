package com.set_and_map.StockMap;

public class Main {
    public static void main(String[] args) {
        StockList stockList = new StockList();

        for (int i = 1; i <= 10; i++) {
            StockItem stockItem = new StockItem("Item " + i, i * 12.3, i * 123);
            stockList.addStockItem(stockItem);
        }
        System.out.println(stockList);

        Basket namBasket = new Basket("Nam");

        for (int i = 1; i <= 5; i++) {
            namBasket.adjustQuantity(stockList.getStockList(), "Item " + i, i * 3);
        }

        System.out.println(namBasket);

        System.out.println(stockList);

        for (int i = 1; i <= 2; i++) {
            namBasket.adjustQuantity(stockList.getStockList(), "Item " + i, i * 3);
        }


        namBasket.adjustQuantity(stockList.getStockList(), "Item 1", 200);
        namBasket.adjustQuantity(stockList.getStockList(), "Item 1", -200);
        namBasket.adjustQuantity(stockList.getStockList(), "Item 1123", 200);

        System.out.println(namBasket);


        System.out.println(stockList);
    }
}
