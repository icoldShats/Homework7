package AirportTowerSimulator;

public class Helicopter extends Aircraft {

    public Helicopter(String id, TowerMediator mediator) {
        super(id, mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Helicopter " + id + " received: " + msg);
    }

    @Override
    public boolean isEmergency() {
        return true;
    }
}
