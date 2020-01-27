* SINGLE RESPONSIBILITY PRINCIPLE:-
A class should only have one reason to change.


* OPEN CLOSED PRINCIPLE:-
Open to extension but closed for extension. 

* Liskov Substitution PRINCIPLE:-
Requirement change should not bring fail in the design. 
It should be reslient (should be easy to bring change)

* Subtype and BaseType
What the LSP indicates is that subtype behavior should match base type behavior as defined in the base type specification.

##


Well, a square clearly IS a type of rectangle in the real world. Whether we can model this in our code depends on the spec. 
What the LSP indicates is that subtype behavior should match base type behavior as defined in the base type specification. 
If the rectangle base type spec says that height and width can be set independently, then LSP says that square cannot be a subtype of rectangle. 
If the rectangle spec says that a rectangle is immutable, then a square can be a subtype of rectangle. 
It's all about subtypes maintaining the behavior specified for the base type.

Srouce:- https://stackoverflow.com/questions/56860/what-is-an-example-of-the-liskov-substitution-principle

If Square is a rectangle, then it should be usable anywhere, where the rectangle is used.

- The various subtypes of a class should be able to be used interchangibly where and instance of that class
is expected. This encourages code that allows developers to easily swop out, diff. implementations without affecting
existing code.



If width and height can be altered by setters, there should be just a rectangle class and no special square class. 
Instead, the rectangle class should have a getter that is named IsSquare. 
Whenever width and height have the same values, IsSquare will return true, otherwise false. Types are not always static, but sometimes - like in this case - can change.

Example: Database Persistance, some objects you only want to persist, while some you only want to read.

- Interface Segregation Principle

Interfaces should be as small as possible and should have methods that are directly relavant to the clients that use the interface.


When a client depends on methods it doesn’t use, it means that your abstractions are wrong. 
Martin Fowler’s example of Role Interface (which is a natural consequence of applying ISP) just exposes wrong initial object decomposition. 
And it doesn’t take a standalone principle to claim that. 
The code is plainly not cohesive. So don’t ponder on whether your code violates Interface Segregation Principle, 
think about whether your abstractions are correct.

“Clients should not be forced to depend upon interfaces that they do not use.”


Read: https://stackify.com/interface-segregation-principle/

Good One: https://dzone.com/articles/solid-principles-by-example-interface-segregation


DEPENDENCY INVERSION PRINCIPLE

- A high level module should not depend on low level modules
- Abstractions should not depend on the details, details should depend on the abstractions.


Good: https://springframework.guru/principles-of-object-oriented-design/dependency-inversion-principle/

