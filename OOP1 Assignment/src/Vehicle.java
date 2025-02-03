//interface Class
interface Vehicle {
    void start(); // Abstract method, which is a default in interfaces
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}
