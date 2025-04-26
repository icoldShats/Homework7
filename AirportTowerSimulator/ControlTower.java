package AirportTowerSimulator;
import java.util.Queue;
import java.util.LinkedList;


public class ControlTower implements TowerMediator{
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private Queue<Aircraft> takeoffQueue = new LinkedList<>();
    private boolean runwayBusy = false;

    public void broadcast(String msg, Aircraft sender) {
        System.out.println("Tower received from " + sender.id + ": " + msg);

        if (msg.equals("day")) {
            System.out.println("landing " + sender.id);
            landingQueue.remove(sender);
            landingQueue.addFirst(sender);  // Prioritize
            notifyAllHold();
            requestRunway(sender);
        } else if (msg.equals("landing req")) {
            landingQueue.add(sender);
        } else if (msg.equals("takeoff")) {
            takeoffQueue.add(sender);
        }
    }
    private void notifyAllHold() {
        for (Aircraft a : landingQueue) {
            a.receive("Hold position: emergency in progress.");
        }
        for (Aircraft a : takeoffQueue) {
            a.receive("Hold takeoff: emergency in progress.");
        }
    }
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
