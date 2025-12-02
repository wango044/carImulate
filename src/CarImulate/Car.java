package CarImulate;

public class Car {
    private int power;
    private String color;
    private String model;
    private TypesOfCars type;

    Car(int power, String color, String model, TypesOfCars type){
        this.power = power;
        this.color = color;
        this.model = model;
        this.type = type;
    }

    public int getPower(){return power;}
    public void setPower(int power){this.power = power;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}

    public TypesOfCars getType(){return type;}
    public void setType(TypesOfCars type){this.type = type;}

    @Override
    public String toString() {
        return " "
                + "Модель - " + model
                + ", Цвет - " + color
                + ", Мощность - " + power
                + ", Тип - " + type.getDescription();
    }

    public void showInfo(){
        System.out.println(toString().toUpperCase());
    }
}
