package com.set_and_map.StockMap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private String nameClient;

    private Map<String, StockItem> listItems = new TreeMap<>();


    public Basket(String nameClient) {
        this.nameClient = nameClient;
    }

    public int adjustQuantity(Map<String, StockItem> stockList, String nameItem, int quantity) {
        StockItem stockItem = stockList.get(nameItem);
        if (stockItem == null) {
            System.out.println("We don't sell " + nameItem + " !.");
            return -1;
        }

        if (stockItem.getQuantity() < quantity || quantity < 0) {
            if (quantity < 0) {
                System.out.println(nameItem + " have quantity invalid !.");
                return -1;
            }
            System.out.println(nameItem + " in stock not less than !.");
            return -1;
        }

        StockItem itemInBasket = this.listItems.get(nameItem);
        if (itemInBasket == null) {
            itemInBasket = new StockItem(nameItem, stockItem.getPrice(), quantity);
            this.listItems.put(nameItem, itemInBasket);
        } else {
            StockItem newValue = new StockItem(itemInBasket.getName(), itemInBasket.getPrice(), itemInBasket.getQuantity() + quantity);
            this.listItems.replace(nameItem, itemInBasket, newValue);
        }

        stockItem.adjustQuantity(-quantity);

        return this.listItems.get(nameItem).getQuantity();
    }

    @Override
    public String toString() {
        String keys = "\n";
        String s = String.format("\n%s of %s:\n", this.getClass().getSimpleName(), this.getNameClient());
        double totally = 0;
        for (Map.Entry<String, StockItem> item : this.getListItems().entrySet()) {
            StockItem stockItem = item.getValue();
            double total = stockItem.getQuantity() * stockItem.getPrice();
            s += (stockItem + String.format("There have quantity is %d, total is %.2f$\n", stockItem.getQuantity(), total));
            keys += item.getKey() + "\n";
            totally += total;
        }
        return s + "\nTotal: " + totally + "$\n";
    }

    public Map<String, StockItem> getListItems() {
        return Collections.unmodifiableMap(listItems);
    }

    public String getNameClient() {
        return nameClient;
    }
}
