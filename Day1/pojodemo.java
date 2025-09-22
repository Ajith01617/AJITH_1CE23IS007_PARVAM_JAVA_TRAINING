 class Car{
    private String name;
    private String colour;
    private Integer price;

    public String getName() {
        return name;
    }
    public String getColour() {
        return colour;
    }
    public Integer getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setPrice(Integer price) {
        this.price = price;
    } 
    @Override
    public String toString() {
        return "Car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
    }

}

public class Pojodemo{
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("BMW");
        car.setColour("black"); 
        car.setPrice(5000000);
        System.out.println(car);     
    }
}