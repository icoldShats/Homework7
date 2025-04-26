package AirportTowerSimulator;
import java.util.Queue;
import java.util.LinkedList;


public class ControlTower implements TowerMediator{
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private Queue<Aircraft> takeoffQueue = new LinkedList<>();
    private boolean runwayBusy = false;
}
