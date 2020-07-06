package designpattern.factory;

import designpattern.factory.implClasses.WindowOS;

public class ClientImplemention {
    public static void main(String[] args) {
        Factory factory = new Factory();
       OperatingSystem window=  factory.getInstance("window");
       window.features(); // creational design pattern
    }
}
