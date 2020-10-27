package com.company;
import java.util.Scanner;
public class Food_Item {
    /*public static Scanner in = new Scanner(System.in);
    public static int price = in.nextInt();
    public static String countType = in.nextLine();
    public static int weight = in.nextInt();
    public static String formula = in.nextLine();*/

    //public static Scanner in = new Scanner(System.in);
    public int price;
    public String countType;
    public int weight;
    public String formula;

    public Food_Item(int price, String countType, int weight, String formula) {
        this.price = price;
        this.countType = countType;
        this.weight = weight;
        this.formula = formula;
    }




}
