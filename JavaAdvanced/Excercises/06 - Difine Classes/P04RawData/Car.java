package JavaAdvanced.Excercises.DefiningClasses.P04RawData;

public class Car {
    //model, engine, cargo, and a collection of exactly 4 tires
    String model;
    Engine engine;
    Cargo cargo;
    Tires[] tires;

    public Car(String model, Engine engine, Cargo cargo, Tires[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }
    public boolean isFlamable() {
        return this.engine.getEnginePower() > 250;
    }

    public boolean isSmaller() {
        for (Tires tire : this.tires) {
            if (tire.getTiresPressure() < 1) {
                return true;
            }
        }
        return false;
    }

    public String getModel() {
        return model;
    }
}
