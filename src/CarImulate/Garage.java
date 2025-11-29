package CarImulate;
import java.util.*;
public class Garage {

    private List<Car> cars;

    public Garage() {
        this.cars = new ArrayList<>();
    }

    public void addCarToGarage(Car car){
        cars.add(car);
        System.out.println("Машина добавлена в гараж!");
    }

    public void showGarage(){
        for (Car car : cars){
            System.out.println("Ваш гараж:");
            System.out.println(car);
        }
    }
}
