package designpattern.adaptor;

public class ChargingAssignment {

    Charger charger;

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public void doCharging(){
        charger.charge();
    }
}
