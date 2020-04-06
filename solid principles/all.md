# Single Responsibility Principle
Example:
You do logging
changing the logging to colorrized
logging


# open closed principle
- Multiple choice questions, print quiz example

https://www.youtube.com/watch?v=-ptMtJAdj40

#-----------------------------------------------------------------------------------------

# liskov substitution Principle

Square Rectangle Example
Square is correctly inherited from Shape

Read about Composition vs Inheritance

Car   - TransportVehicle (Start Engine Behavoiur)
BiCycle

Bird - Animal  ( fly Behaviour )
Dog

https://www.youtube.com/watch?v=dJQMqNOC4Pc

#-----------------------------------------------------------------------------------------

# Interface Segregation Principle


In js there is no concept of interfaces, but this is applicable even without interfaces

- The class that implements the interface should implement every single method of the interface.

- Class and inhertance


In JS, we make components or anoynomous functions
then using protoype, we can assign new functions

No fat interfaces
Light interfaces


https://www.youtube.com/watch?v=CWrRwC8iB30

WebDevSimplified

- Interface mein wahi ho jo client ko implement karna hai

- Rectangle Square
  Interface has area() function only



#---------------------------------------------


D - Dependency Inversion Principle
This might sound more complex than it often is. If you consequently apply the Open/Closed Principle and the Liskov Substitution Principle to your code, it will also follow the Dependency Inversion Principle.

public interface CoffeeMachine {
    Coffee brewFilterCoffee();
}

public interface EspressoMachine {
    Coffee brewEspresso();
}

public class BasicCoffeeMachine implements CoffeeMachine
public class PremiumCoffeeMachine implements CoffeeMachine, EspressoMachine

machine = new PremiumCoffeeMachine();

##

public class CoffeeApp {
    private CoffeeMachine coffeeMachine;

    public CoffeeApp(CoffeeMachine coffeeMachine) {
     this.coffeeMachine = coffeeMachine
    }

    public Coffee prepareCoffee() throws CoffeeException {
        Coffee coffee = this.coffeeMachine.brewFilterCoffee();
        System.out.println("Coffee is ready!");
        return coffee;
    }
}

##


https://stackoverflow.com/questions/5349003/dependency-inversion-principle-in-javascript
https://netbasal.com/demystifying-the-dependency-inversion-principle-in-angular-a2daca9b05ee

A. High-level modules should not depend on low-level modules.  Both should depend on abstractions.

ProductCatalog
ProductRepo (interface)
SQLRepo
ProductFactory

##

- Its about abstractions not the details
- An Interface is called an Abstraction because it is focused on the characteristic of a Class rather than the Class as a whole group of characteristics.

https://blog.bitsrc.io/solid-the-dependency-inversion-principle-in-angular-6e4b9c484960


##
Signs of Bad Design
The coupling between components results in a rigid system that is hard to change, and one that fails when changes are introduced.

It is hard to change because every change affects too many other parts of the system. (Rigidity)
When you make a change, unexpected parts of the system break. (Fragility)
It is hard to reuse in another application because it cannot be disentangled from the current application. (Immobility)

##

Depend on abstractions



JS related
https://stackoverflow.com/questions/5349003/dependency-inversion-principle-in-javascript
https://netbasal.com/demystifying-the-dependency-inversion-principle-in-angular-a2daca9b05ee
https://blog.bitsrc.io/solid-the-dependency-inversion-principle-in-angular-6e4b9c484960