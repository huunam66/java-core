package com.set_and_map.StockMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private Map<String, StockItem> stockList;


    public StockList() {
        this.stockList = new LinkedHashMap<>();
//        this.stockList = new HashMap<>();
    }

    public int addStockItem(StockItem item) {
        if (item == null) return 0;

        StockItem findItem = this.stockList.get(item.getName());
        if (findItem != null) {
            int findItemQuantity = findItem.getQuantity();
            int itemQuantity = item.getQuantity();
            item = new StockItem(findItem.getName(), findItem.getPrice(), findItemQuantity + itemQuantity);
            this.stockList.replace(item.getName(), item);
            return item.getQuantity();
        }

        this.stockList.put(item.getName(), item);
        return item.getQuantity();
    }

    @Override
    public String toString() {
        String keys = "\n";
        String s = "\nList Stock:\n";
        double totally = 0;
        for (Map.Entry<String, StockItem> item : this.getStockList().entrySet()) {
            StockItem stockItem = item.getValue();
            double total = stockItem.getQuantity() * stockItem.getPrice();
            s += (stockItem + String.format("There have quantity is %d, total is %.2f$\n", stockItem.getQuantity(), total));
            keys += item.getKey() + "\n";
            totally += total;
        }
        return s + "\nTotal: " + totally + "$\n" + keys;
    }

    public Map<String, StockItem> getStockList() {
        return Collections.unmodifiableMap(stockList);
    }
}
