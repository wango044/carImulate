package CarImulate;

public class Car {
    private int power;
    private String color;
    private String model;

    Car(int power, String color, String model){
        this.power = power;
        this.color = color;
        this.model = model;
    }

    public int getPower(){return power;}
    public void setPower(int power){this.power = power;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}

    @Override
    public String toString() {
        return " "
                + "Модель - " + model
                + ", Цвет - " + color
                + ", Мощность - " + power;
    }

    public void showInfo(){
        System.out.println(toString().toUpperCase());
    }
}
