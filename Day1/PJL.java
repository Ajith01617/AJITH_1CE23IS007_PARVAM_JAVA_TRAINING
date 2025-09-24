import java.util.Arrays;

class Car{
    String[] name;
    String[] model;
    String[] price;
    String[] year;
    String[] color;

    public Car(String[] color, String[] model, String[] name, String[] price, String[] year) {
        this.color = color;
        this.model = model;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [name=" + Arrays.toString(name) + ", model=" + Arrays.toString(model) + ", price="
                + Arrays.toString(price) + ", year=" + Arrays.toString(year) + ", color=" + Arrays.toString(color)
                + "]";
    }

}
public class PJL {
    
}
