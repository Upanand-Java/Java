package designpattern.factory;

import designpattern.factory.implClasses.AndroidOs;
import designpattern.factory.implClasses.IosOs;
import designpattern.factory.implClasses.WindowOS;

public class Factory {

    public OperatingSystem getInstance(String str){

        if(str.equals("")){
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
        }
    }
}
