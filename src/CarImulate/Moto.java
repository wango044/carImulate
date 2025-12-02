package CarImulate;

public class Moto extends Transport {

    private String type_of_moto;
    Moto(String brand, String model, int price, int year, int maxSpeed, String type_of_moto) {
        super(brand, model, price, year, maxSpeed);
        this.type_of_moto = type_of_moto;
    }

    public String getType_of_moto(){return type_of_moto;}

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя на вашем мотоцикле... Готово!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель заглушен.");
    }

    @Override
    public void makeSound() {
        System.out.println("Врум!");
    }
}
