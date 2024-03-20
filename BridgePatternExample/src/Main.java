public class Main {
    public static void main(String[] args) {
        Engine gasolineEngine = new GasEngine();
        Engine dieselEngine = new DieselEngine();

        Car normalCar = new NormalCar(gasolineEngine);
        Car luxuryCar = new LuxuryCar(dieselEngine);

        normalCar.drive();
        luxuryCar.drive();
    }
}