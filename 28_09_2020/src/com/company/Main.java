package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.util.Map.entry;


public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        //task1();
        task2();

    }
    public static void task1(){
        Map<Character, Long> frequency = new HashMap<Character, Long>();


        String a = in.next().toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            char localCh = a.charAt(i);
            if (frequency.containsKey(localCh)== false){


                frequency.put(localCh, a.chars().filter( ch -> ch == localCh).count());

            }
        }
        System.out.println(frequency);
    }
    public static void task2(){
        Map<String, Integer> input = Map.ofEntries(entry("sign",1), entry("Man",21), entry("Sky", 11));

        Map<Integer, String> output = new HashMap<Integer, String>();
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            String kCup = entry.getKey();
            Integer vCup = entry.getValue();
            if (output.containsKey(vCup)== false){
                output.put(vCup, kCup);
            }else {
                output.put(vCup, output.get(vCup)+kCup);
            }

        }
        System.out.println(output.get(1));

    }


}
