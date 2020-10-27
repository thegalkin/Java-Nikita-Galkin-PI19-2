package com.company;
import java.util.*;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public ArrayList<Food_Item> currentMenu;
    public ArrayList<Food_Item> stopListItems = new ArrayList<Food_Item>();
    public Menu(ArrayList<Food_Item> currentMenu){
    this.currentMenu = currentMenu;
    }
    public void addToStopList(ArrayList<Food_Item> stopListItems){
        this.stopListItems.add(stopListItems);
    }
    public void changeMenu(){
        System.out.println("Insert what you whant to do with the menu(delete/add item)");
        String tempIn = in.nextLine();

        System.out.println("What item do you want to change?");
        if (tempIn.equals("delete")){
            String itemForDeletion = in.nextLine();
            for (int i = 0; i < currentMenu.size(); i++) {
                if (currentMenu[i] == itemForDeletion){
                    currentMenu = currentMenu.remove(i);
                }
            }


        } else if(tempIn.equals("add")) {
            String itemToAdd = in.nextLine();

        } else{
            System.out.println("Wrong command");
        }
    }
}
