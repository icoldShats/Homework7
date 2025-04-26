package AirportTowerSimulator;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        List<Aircraft> aircrafts = List.of(
                new PassengerPlane("P1", tower),
                new CargoPlane("C1", tower),
                new Helicopter("H1", tower)
        );

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Random rand = new Random();

        // Периодически отправляем команды
        scheduler.scheduleAtFixedRate(() -> {
            Aircraft a = aircrafts.get(rand.nextInt(aircrafts.size()));
            if (rand.nextBoolean()) {
                a.send("landing");
            } else {
                a.send("takeoff");
            }

            if (rand.nextInt(10) == 0) { // иногда emergency "day"
                a.send("day");
            }
        }, 0, 1, TimeUnit.SECONDS);

        // Остановить симуляцию через 10 секунд
        scheduler.schedule(() -> {
            scheduler.shutdown();
            System.out.println("Simulation finished.");
        }, 10, TimeUnit.SECONDS);
    }
}
