import Adapter.Chef2;
import Adapter.ChefAdapter;
import Adapter.Order;
import Adapter.VisitorOrder;
import Decorator.BasicDish;
import Decorator.Dish;
import Decorator.ExtraCheeseDecorator;
import Factory.RegularVisitorFactory;
import Factory.VIPVisitorFactory;
import Factory.VisitorFactory;
import Observer.Chef;
import Observer.Visitor;
import Singleton.RestaurantManager;
import Strategy.BoilingStrategy;
import Strategy.CookingStrategy;
import Strategy.FryingStrategy;
import Strategy.GrillingStrategy;

public class Main {
    public static void main(String[] args) {

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.walkAroundRestaurant();


        CookingStrategy grillingStrategy = new GrillingStrategy();
        CookingStrategy fryingStrategy = new FryingStrategy();
        CookingStrategy boilingStrategy = new BoilingStrategy();
        grillingStrategy.cook("barbecue");
        fryingStrategy.cook("onion");
        boilingStrategy.cook("water");

        Chef chef1 = new Chef();
        chef1.addObserver(new Visitor("Damir"));
        chef1.addObserver(new Visitor("Nurik"));
        chef1.addObserver(new Visitor("Abylai"));

        Chef chef2 = new Chef();
        chef2.addObserver(new Visitor("Adam"));
        chef2.addObserver(new Visitor("Adam2"));


        VisitorFactory regularVisitorFactory = new RegularVisitorFactory();
        regularVisitorFactory.createVisitor("Damir");
        VisitorFactory vipVisitorFactory = new VIPVisitorFactory();
        vipVisitorFactory.createVisitor("Tokaev");

        Chef2 chef = new Chef2();
        Order order = new ChefAdapter(chef, "Стейк");
        order.placeOrder();

        // Добавление дополнительных ингредиентов в блюда с использованием шаблона декоратора
        Dish basicDish = new BasicDish();
        Dish dishWithExtraCheese = new ExtraCheeseDecorator(basicDish);


        System.out.println("Description: " + dishWithExtraCheese.getDescription());
        System.out.println("Cost: $" + dishWithExtraCheese.getCost());
    }
}
