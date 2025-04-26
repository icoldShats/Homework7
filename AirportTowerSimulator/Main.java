package AirportTowerSimulator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    ControlTower tower = new ControlTower();
    List<Aircraft> aircrafts = List.of(
            new PassengerPlane("P1", tower)
    );

    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    Random rand = new Random();
}
