# SDP-Final
Final project

Singleton Pattern (RestaurantManager):
The Singleton pattern ensures that only one instance of the RestaurantManager class can exist. In your code, RestaurantManager.getInstance() is used to obtain the sole instance of the RestaurantManager. This pattern is handy when you want to centralize control, such as managing a unique resource.

Strategy Pattern (CookingStrategy, GrillingStrategy, FryingStrategy, BoilingStrategy):
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. In your code, you have different cooking strategies (GrillingStrategy, FryingStrategy, BoilingStrategy), and you use them interchangeably by assigning them to the CookingStrategy interface. This allows you to switch between cooking methods dynamically.

Observer Pattern (Chef, Visitor):
The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. In your code, Chef is the subject, and Visitor is the observer. Visitors are added as observers to chefs, and when a chef changes state (probably when cooking), the corresponding visitors are notified.

Factory Method Pattern (RegularVisitorFactory, VIPVisitorFactory):
The Factory Method pattern provides an interface for creating instances of a class but allows subclasses to alter the type of instances that will be created. In your code, RegularVisitorFactory and VIPVisitorFactory are creating instances of Visitor. This pattern is useful when you want to delegate the responsibility of instantiating objects to subclasses.

Adapter Pattern (ChefAdapter):
The Adapter pattern allows the interface of an existing class to be used as another interface. In your code, ChefAdapter is adapting the Chef2 class to the Order interface. This allows you to use Chef2 in the context where an Order is expected.

Decorator Pattern (BasicDish, ExtraCheeseDecorator):
The Decorator pattern attaches additional responsibilities to an object dynamically. In your code, BasicDish represents a basic dish, and ExtraCheeseDecorator adds extra cheese to a dish. This pattern allows you to create flexible and composable combinations of behaviors.

These patterns help in making your code more modular, extensible, and maintainable by promoting good design principles.





