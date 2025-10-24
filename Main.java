import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем массив машин для тестирования
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000, "AB123CD"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000, "EF456GH"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "IJ789KL"),
            new Car(4, "BMW", "X5", 2018, "Blue", 45000, "MN012OP")
        };

        // Тестируем метод getCarByBrend
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Машины марки Toyota:");
        for (Car car : toyotaCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear());
        }
    }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        ArrayList<Car> resultList = new ArrayList<>();
        
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                resultList.add(car);
            }
        }
        
        return resultList.toArray(new Car[0]);
    }
}