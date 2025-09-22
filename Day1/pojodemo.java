import java.util.Arrays;

class Car{
    private String[] name;
    private String[] colour;
    private Integer[] price;
    private Integer[] year; 

    public String getName(int i) {
        return name[i];
    }
    public String getColour(int i) {
        return colour[i];
    }
    public Integer getPrice(int i) {
        return price[i];
    }
    public Integer getYear(int i) {
        return year[i];
    }
    public String getDetailsAt(int i){
        return "Name: "+name[i]+" , Colour: "+ colour[i]+" , Price: "+ price[i]+ " , Year: "+year[i];
    }


    public void setName(String[] name) {
        this.name = name;
    }
    public void setColour(String[] colour) {
        this.colour = colour;
    }
    public void setPrice(Integer[] price) {
        this.price = price;
    } 
    public void setYear(Integer[] year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car [name=" + Arrays.toString(name) + ", colour=" + Arrays.toString(colour) + ", price="
                + Arrays.toString(price) + ", year=" + Arrays.toString(year) + "]";
    }
    
}

public class Pojodemo{
    public static void main(String[] args) {
        Car c = new Car();
        String[] name = {"Bmw","Audi","Benz","Toyato"};
        String[] colour = {"Black","red","white","Torcoise"};
        Integer[] price = {10000, 2000, 400,60};
        Integer[] year= {1998,2000,2022,2002};
        c.setName(name);
        c.setColour(colour);
        c.setPrice(price);
        c.setYear(year);
        
        for(int i =0; i<year.length-1;i++){
            for(int j =0; j<year.length-1;j++){
                int a = j;
                int b = j;
                int d = j;

                if(year[j]>year[j+1]){
                   int temp1 = year[j];
                   year[j]=year[j+1];
                   year[j+1]=temp1; 

                   int temp2 = price[a];
                   price[a]=price[a+1];
                   price[a+1]=temp2;

                   String temp3= name[b];
                   name[b]=name[b+1];
                   name[b+1]=temp3;

                   String temp4= colour[d];
                   colour[d]=colour[d+1];
                   colour[d+1]=temp4;
                }

            }
        }


        for (int i = 0; i < name.length; i++) {
            System.out.println(c.getDetailsAt(i));
        }
    }
}

