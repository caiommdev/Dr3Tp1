package org.example;

import org.example.animals.Brid;
import org.example.flyable.IFlyable;

public class Main {
    public static void main(String[] args) {
        IFlyable obj = new Brid();
        obj.Fly(10);
    }
}