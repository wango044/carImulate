package CarImulate;

public abstract class Transport {
    private String brand;
    private String model;
    private int price;
    private int year;
    private int maxSpeed;

    Transport(String brand, String model, int price, int year, int maxSpeed){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public int getPrice(){return price;}
    public int getYear(){return year;}
    public int getMaxSpeed(){return maxSpeed;}

    public abstract void startEngine();

    public abstract void stopEngine();

    public abstract void makeSound();
}
