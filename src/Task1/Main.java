package Task1;

public class Main
{
    public static void main(String[] args) {
        Driver driver = new Driver("Søren", 20);
        Car car = new Car("Audi", "A4", 2022, "Limo");
        car.setDriver(driver);
        System.out.println(car.toString());
        System.out.println(driver.toString());
        Car car1 = new Car("Mclaren", "720s Spider", 2022, "Sport");
        car1.setDriver(driver);
        System.out.println(car1.toString());
        System.out.println(driver.toString());
    }
}
