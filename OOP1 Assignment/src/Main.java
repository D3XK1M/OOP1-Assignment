public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark(); //Output = Wooooof

        // Animal myAnimal = new Animal(); // Error will say -> Cannot instantiate an abstract class

        Cat myCat = new Cat();
        myCat.sing(); // Output = Meow
        myCat.drive(); //Output = Sleeping....

        Bike myBike = new Bike();
        myBike.start();
    }
}
