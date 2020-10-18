package Task_2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Vector {
    private int x, y, z;
    private double dx, dy, dz;
    private int[] cords;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector (int len) {
        this.cords = new int[len];
    }

    public Vector (double x, double y, double z) {
        this.dx = x;
        this.dy = y;
        this.dz = z;
    }

    public double GetLength() {
        return Math.sqrt(x*x + y*y + z*z);
    }


    public static Vector[] GTask (int N) {
        Vector[] Arr = new Vector[5];
        double a;
        double b;
        double c;
        for (int i = 0; i < Arr.length; i++){
            boolean f = true;
            while (f) {
                a = ThreadLocalRandom.current().nextDouble(0, 9 + 1);
                b = ThreadLocalRandom.current().nextDouble(0, 9 + 1);
                c = ThreadLocalRandom.current().nextDouble(0, 9 + 1);
                Vector RandV = new Vector(a,b,c);
                if (RandV.GetLength() == N) {
                    f = false;
                    Arr.add(RandV);

                }

            }
          
        }
        return Arr;
    }

}
