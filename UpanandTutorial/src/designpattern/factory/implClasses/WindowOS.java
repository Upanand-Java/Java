package designpattern.factory.implClasses;

import designpattern.factory.OperatingSystem;

public class WindowOS implements OperatingSystem {
    @Override
    public void features() {
        System.out.println("Here is window operating system !!");
    }
}
