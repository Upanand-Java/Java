package designpattern.adaptor;

import designpattern.outsideadaptor.NokiaCharger;

public class ChargerAdaptor implements Charger {

    NokiaCharger nokiaCharger = new NokiaCharger();
    @Override
    public void charge() {
        nokiaCharger.chargeWithNokia();

    }
}
