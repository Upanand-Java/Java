package designpattern.factory;

import designpattern.factory.implClasses.WindowOS;

import java.util.Optional;

public class ClientImplemention {
    public static void main(String[] args) {
        Factory factory = new Factory();
      // OperatingSystem window=  factory.getInstance("window");
       //window.features(); // creational design pattern

        OperatingSystem system = factory.getInstance("window").
                orElseThrow(()-> new IllegalArgumentException("Not valid"));

        system.features();
    }
}
