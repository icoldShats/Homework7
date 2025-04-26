package AirportTowerSimulator;

public class CargoPlane extends Aircraft {

    public CargoPlane(String id, TowerMediator mediator) {
        super(id, mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("CargoPlane " + id + " received: " + msg);
    }

    @Override
    public boolean isEmergency() {

        return false;
    }
}
