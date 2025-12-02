package CarImulate;


public enum TypesOfCars {
    SPORT_CAR(1, "Спортивная машина"),
    TRACK(2, "Грузовик"),
    SEDAN(3, "Седан"),
    UNIVERSAL(4, "Универсал"),
    COUPE(5, "Купе");


    private final int number;
    private final String description;

    TypesOfCars(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }


    public static void displayAllTypes() {
        System.out.println("🎯 ДОСТУПНЫЕ ТИПЫ МАШИН:");
        for (TypesOfCars type : values()) {
            System.out.printf("%d - %s\n", type.number, type.description);
        }
    }

    public static TypesOfCars getByNumber(int number){
        for(TypesOfCars type : values()){
            if (type.getNumber() == number){
                return type;
            }
        }
        throw new IllegalArgumentException("Неизвестный номер типа: " + number + ". Доступные номера: 1-" + values().length);
    }
}


