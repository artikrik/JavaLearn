package com.company.w7;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(9.2f,5f);
        MovablePoint mp = new MovablePoint(6.0f,5.8f,1.0f,1.8f);
        MovablePoint mp2 = new MovablePoint(1.0f,1.8f);
        System.out.println(p.toString());
        System.out.println(mp.toString());
        mp.move(mp);
//        mp.move(new MovablePoint(6.3f,5f));
        System.out.println(mp.toString());
        System.out.println(mp2.toString());

    }
}
