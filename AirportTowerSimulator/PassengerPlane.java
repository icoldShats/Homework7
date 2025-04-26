package AirportTowerSimulator;

class PassengerPlane extends Aircraft {
    public PassengerPlane(String id, TowerMediator m) {
        super(id, m);
    }
    public void receive(String msg) {
        System.out.println("PassengerPlane " + id + " got: " + msg);
    }
    public boolean isEmergency() {
        return false;
    }
}
