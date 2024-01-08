package JavaAdvanced.Excercises.Generics.P01GenericBox;

public class Box <T>{
    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.getClass().getName() +": " + data;
    }
}

