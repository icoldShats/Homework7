package AirportTowerSimulator;

public abstract class Aircraft {
    protected String id;
    protected TowerMediator mediator;

    // Конструктор для инициализации id и посредника
    public Aircraft(String id, TowerMediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    // Отправка сообщения через посредника
    public void send(String msg) {
        mediator.broadcast(msg, this);
    }

    // Абстрактный метод для получения сообщений
    public abstract void receive(String msg);

    // Абстрактный метод для определения экстренной ситуации
    public abstract boolean isEmergency();
}
