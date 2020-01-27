- Find the factors, i.e - how many things this function is performing
- Refactoring should not change what the function is doing.



COMPOSITE DESIGN PATTERN
https://www.geeksforgeeks.org/composite-design-pattern/
https://refactoring.guru/design-patterns/composite


# Decorator Pattern
Decorator is a Conceptual pattern that allows adding new behaviors to objects dynamically by placing them inside special wrapper objects.


https://refactoring.guru/design-patterns/decorator/ruby/example

https://www.journaldev.com/1540/decorator-design-pattern-in-java-example


# Builder Pattern
To construct complex objects step by step

director = new Director()

CarBuilder builder = new CarBuilder()
director.constructSportsCar(builder)
Car car = builder.getProduct()



Nice to read
https://medium.com/visual-development/how-to-fix-nasty-circular-dependency-issues-once-and-for-all-in-javascript-typescript-a04c987cf0de

* All dependencies are loaded from once place.

# Bounded Context Pattern


ITextReader reader = new FileReader(); // Infrastructure
ITextWriter writer = new FileWrite(); // Infrastructure

Domain domain = new Domain(reader, writer); // Composer. Where reader and write are dependency injection
domain.DoWork();

# Inversion Control
https://stackoverflow.com/questions/3058/what-is-inversion-of-control
https://asimplify.com/dependency-injection-inversion-control/

The Inversion of Control (IoC) and Dependency Injection (DI) patterns are all about removing dependencies from your code.

For example, say your application has a text editor component and you want to provide spell checking. Your standard code would look something like this:

public class TextEditor {

    private SpellChecker checker;

    public TextEditor() {
        this.checker = new SpellChecker();
    }
}

- Following code is preferred instead of above:-

public class TextEditor {

    private IocSpellChecker checker;

    public TextEditor(IocSpellChecker checker) {
        this.checker = checker;
    }
}

Instead of creating instance of the spell check in this class, it is passed as an
argument. So this class does not create it, framework/container creates it.
"Don't call us, We'll call you"
Consumer of a feature defines and owns its API
Concrete implemetation depends upon the consume

DI is allowing us to inject concrete implementation to the consumer.

- Sum example
function Sum(a, b) {
  return a+b
}

# --

- Speration of concerns from domain and presentation
- Removing infrastructure from domain, which are its concerns
  - Isolating the infrastructure code


# Rules Pattern
Application of SRP and Open closed principle

https://www.michael-whelan.net/rules-design-pattern/

---
Discount Example.

if (rule) {
  do this for customer
}

or rather

find rule for the custome. rule = rules.find(rule =>  rule.isMatch(customer))
if (rule)
  rule.applyRuleFunction

OrderRule
  isMatch(customer)
    return true

# Visitor Pattern
https://refactoring.guru/design-patterns/visitor


GOOD EXAMPLE
https://www.geeksforgeeks.org/visitor-design-pattern

- A visitor class which implements visit function.
- A Visitable class which implements accept.
- Visitable class has all visit function specifically to visit that object.
- How this visit function of Visitor is called ?
    This visit function is called from accept function of the concrete class

https://www.youtube.com/watch?v=UKmNGiaTN40


