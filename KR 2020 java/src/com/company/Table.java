package com.company;

public class Table {
    public Food_Item[] tableOrders;
    public int numberOfPeople;
    public Table(int numberOfPeople){
    this.numberOfPeople = numberOfPeople;
    }
    public makeAnOrder(Food_Item[] order){
        for (int i = 0; i < order.length; i++) {
            if (!Menu.stopListItems.contains(order[i])){
                tableOrders.add(order[i]);
            }else{
                System.out.println("Item is not available today");
            }
        }

    }


    public int getFinal(){
        int sum = 0;
        for (int i = 0; i < tableOrders.length; i++) {
            sum += tableOrders[i].price;
        }
        return sum;
    }
}
