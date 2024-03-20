public abstract class Car {
    protected Engine engine;

    protected Car(Engine engine) {
        this.engine = engine;
    }

    abstract void drive();
}
