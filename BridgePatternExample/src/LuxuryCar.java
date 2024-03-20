public class LuxuryCar extends Car {
    public LuxuryCar(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        engine.start();
        System.out.println("Driving luxury car...");
    }
}

