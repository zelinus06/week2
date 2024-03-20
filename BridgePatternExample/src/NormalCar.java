public class NormalCar extends Car {
    public NormalCar(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        engine.start();
        System.out.println("Driving normal car...");
    }
}
