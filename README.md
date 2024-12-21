# Java Project Architecture and Design

- SOLID
- MVC
- BDD
- TDD
- DDD
- Design Patterns

## Design Patterns
### Strategy
Reduce the complexity of our code by replacing multiple conditionals with classes: this technique is called **Strategy**, which is a behavioral design pattern.

### Chain of Responsibility
The **Chain of Responsibility** pattern is used when you want to avoid coupling the sender of a request to its receiver, allowing multiple objects to have the opportunity to process the request.

### Template Method
The **Template Method** pattern is a behavioral design pattern that defines the structure of an algorithm in a method, allowing subclasses to implement specific steps of the algorithm without altering its overall structure. It ensures that the skeleton of the algorithm remains fixed, but its internal parts can be customized by subclasses.

#### How it works?
The template method pattern defines a "template method" that executes a sequence of operations in a specific order, where some of these operations can be delegated to abstract methods or "hooks" that will be implemented by the subclasses.

### State
The **State Pattern** is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. This pattern is particularly useful when an object must exhibit different behavior based on its state, making the state transitions explicit and manageable.

### Command
The **Command Pattern** is a behavioral design pattern used to encapsulate a request as an object, thereby allowing you to parameterize objects with different requests, queue or log requests, and support undoable operations. This pattern decouples the object that invokes the operation from the one that knows how to perform it.

### Observer Pattern
The **Observer Pattern** is a behavioral design pattern used to establish a one-to-many dependency between objects, so when one object (the subject) changes its state, all its dependents (the observers) are notified and updated automatically. 