package JavaAdvanced.Excercises.DefiningClasses.P04RawData;

public class Engine {
    int engineSpeed;
    int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
