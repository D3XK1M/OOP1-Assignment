1. Abstract Class - Human

An abstract class cannot be instantiated and can have both concrete and abstract methods.

drive(): A concrete method with implementation.

sing(): An abstract method to be implemented by subclasses.

2. Concrete Class - Cat & Dog

A concrete class can be instantiated and must implement any abstract methods from its parent class.

Cat extends Human and implements sing().

Dog is a standalone concrete class with a bark() method.

3. Interface - Vehicle

An interface contains only abstract methods by default.

Vehicle defines start(), which must be implemented by any class that implements it.

Bike implements Vehicle and provides a definition for start().
