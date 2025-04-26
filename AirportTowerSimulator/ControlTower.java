package AirportTowerSimulator;
import java.util.Queue;
import java.util.LinkedList;


public class ControlTower implements TowerMediator{
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private Queue<Aircraft> takeoffQueue = new LinkedList<>();
    private boolean runwayBusy = false;


    public boolean requestRunway(Aircraft a) {
        if (!runwayBusy) {
            runwayBusy = true;
            System.out.println("Runway granted to " + a.id);
            return true;
        }
        return false;
    }

    public void releaseRunway() {
        runwayBusy = false;
    }
}
