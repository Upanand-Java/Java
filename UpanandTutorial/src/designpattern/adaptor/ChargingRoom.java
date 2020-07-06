package designpattern.adaptor;

public class ChargingRoom {
    public static void main(String[] args) {
        ChargingAssignment chargingAssignment = new ChargingAssignment();
        Charger charger = new ChargerAdaptor();
       chargingAssignment.setCharger(charger);
       chargingAssignment.doCharging();

    }
}
