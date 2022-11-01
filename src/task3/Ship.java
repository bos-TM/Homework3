package task3;

public class Ship extends Vehicle{
    int passengers;
    String port;

    public Ship() {
    }

    public Ship(int passengers, String port) {
        this.passengers = passengers;
        this.port = port;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
