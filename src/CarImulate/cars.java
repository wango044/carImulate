package CarImulate;
import java.util.*;
public class cars {
    public static void main(String[] args) {

        String model;
        String color;
        int power;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Создайте машину:");
            System.out.println();
            System.out.println("1. Выберите модель:");
            model = scanner.nextLine();
            System.out.println("2. Выберите цвет:");
            color = scanner.nextLine();
            System.out.println("3. Выберите мощность( в л.с.)");
            power = scanner.nextInt();
            scanner.nextLine();

            Car newCar = new Car(power, color, model);

            System.out.print("ВОТ ВАША МАШИНА - ");

            newCar.showInfo();

            System.out.println("Выберите, что будет с вашей машиной:");
            System.out.println("1 - Едет");
            System.out.println("2 - Тормозит");
            System.out.println("3 - Разобьётся");

            int choise = scanner.nextInt();

            switch (choise){
                case 1:
                    System.out.println("Едем 300 км/ч!!!");
                    break;
                case 2:
                    System.out.println("Тормозим! Аккуратно.");
                    break;
                case 3:
                    System.out.println("На СТО!");
                    break;
                default:
                    System.out.println("Выберите число!");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
