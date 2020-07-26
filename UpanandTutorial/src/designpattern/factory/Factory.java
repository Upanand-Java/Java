package designpattern.factory;

import designpattern.factory.implClasses.AndroidOs;
import designpattern.factory.implClasses.IosOs;
import designpattern.factory.implClasses.WindowOS;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Factory {

    private static Map<String, OperatingSystem> systemMap = new HashMap<>();

    static {
        systemMap.put("window", new WindowOS());
        systemMap.put("ios", new IosOs());
        systemMap.put("android", new AndroidOs());
    }

    public Optional<OperatingSystem> getInstance(String str) {
        return Optional.ofNullable(systemMap.get(str));
    }
}






        /*if(str.equals("")){
            return null;
        }

        if(str.equalsIgnoreCase("window")){
            return new WindowOS();
        }else if(str.equalsIgnoreCase("ios")){
            return new IosOs();
        }else if(str.equalsIgnoreCase("android")){
            return new AndroidOs();
        }else {
            return null;
        }*/


