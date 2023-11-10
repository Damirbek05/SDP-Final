package Singleton;

public class RestaurantManager {
    private static RestaurantManager instance;

    private RestaurantManager() {
        // Закрытый конструктор для предотвращения создания экземпляра извне класса
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }
    public void walkAroundRestaurant() {
        System.out.println("Менеджер ходит по ресторану и контролирует работу персонала.");
    }


}
