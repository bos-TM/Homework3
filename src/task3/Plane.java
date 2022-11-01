package task3;

public class Plane extends Vehicle{
    private double height;
    private int passengers;

    public Plane() {
    }

    public Plane(double height, int passengers) {
        this.height = height;
        this.passengers = passengers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
