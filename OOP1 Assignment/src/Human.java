//Abstract class, cannot be instantiated directly,
            // but can use both concrete and abstract methods
abstract class Human {
    //Concrete method
    public void drive() {
        System.out.println("Driving.....");
    }
    //Abstract method
    public abstract void sing();
}
    //Concrete subclass
class Cat extends Human{
    @Override
    public void sing(){
        System.out.println("La la la la");
    }
}
