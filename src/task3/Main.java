package task3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(550,120);
        plane.setLatitude(156654.23);
        plane.setLongitude(564436.253);
        plane.setPrice(2501100);
        plane.setSpeed(980);
        plane.setYear(2019);

        Ship ship = new Ship(152, "Південний порт");
        ship.setLongitude(256466.40);
        ship.setLatitude(1643862.25);
        ship.setPrice(2130000.0);
        ship.setSpeed(85);
        ship.setYear(1986);

        Car car = new Car();
        car.setLatitude(6555611.23);
        car.setLongitude(125354.263);
        car.setPrice(21500);
        car.setSpeed(120);
        car.setYear(2018);

        System.out.println("-----------------------------");
        System.out.println("----Інформація про літак-----");
        System.out.println("Місцезнаходження:");
        System.out.println("широта " + plane.getLatitude() + ", довгота " + plane.getLongitude() + ", висота " + plane.getHeight());
        System.out.println("Кількість пасажирів: " + plane.getPassengers());
        System.out.println("Швидкість: " + plane.getSpeed());
        System.out.println("Рік випуску: " + plane.getYear());
        System.out.println("Вартість літака: " + plane.getPrice());

        System.out.println("-----------------------------");

        System.out.println("---Інформація про корабель---");
        System.out.println("Місцезнаходження:");
        System.out.println("порт - " + ship.getPort() + "(широта " + ship.getLatitude() + ", довгота " + ship.getLongitude() + ")");
        System.out.println("Кількість пасажирів: " + ship.getPassengers());
        System.out.println("Швидкість: " + ship.getSpeed());
        System.out.println("Рік випуску: " + ship.getYear());
        System.out.println("Вартість літака: " + ship.getPrice());

        System.out.println("-----------------------------");

        System.out.println("--Інформація про автомобіль--");
        System.out.println("Місцезнаходження:");
        System.out.println("широта " + car.getLatitude() + ", довгота " + car.getLongitude());
        System.out.println("Швидкість: " + car.getSpeed());
        System.out.println("Рік випуску: " + car.getYear());
        System.out.println("Вартість літака: " + car.getPrice());
        System.out.println("-----------------------------");
        }
}
