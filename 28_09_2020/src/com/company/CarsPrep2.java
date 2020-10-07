package com.company;

public class CarsPrep2 {
    public class Car{
        private String color = "Blue";
        private int maxSpeed;
        private Boolean mechanic;
        
        private int currentSpeed;

        public void makeNoise(){
            System.out.println("car goes brrr");
        }
    }

    public static class BMW extends Car {
        public String color;

        @Override
        public void makeNoise(){
            System.out.println("car goes rich brrrrr");
        }
        

    }





    public static void main(String[] args) {
        
        BMW abmw = new BMW();
        System.out.println(abmw.color);

    }
}
