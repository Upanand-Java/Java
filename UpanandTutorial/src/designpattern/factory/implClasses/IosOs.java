package designpattern.factory.implClasses;

import designpattern.factory.OperatingSystem;

public class IosOs implements OperatingSystem {
    @Override
    public void features() {
        System.out.println("Here is IOS operating system !!");
    }
}
