package designpattern.factory.implClasses;

import designpattern.factory.OperatingSystem;

public class AndroidOs implements OperatingSystem {
    @Override
    public void features() {
        System.out.println("Here is ANdroid operating system !!");
    }
}
