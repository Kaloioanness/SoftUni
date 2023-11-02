package JavaAdvanced.Excercises.DefiningClasses.P04RawData;

public class Tires {
    int tiresAge;
    double tiresPressure;

    public Tires(double tiresPressure, int tiresAge) {
        this.tiresPressure = tiresPressure;
        this.tiresAge = tiresAge;
    }

    public double getTiresPressure() {
        return tiresPressure;
    }

}
