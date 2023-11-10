package Observer;

public class Visitor implements Observer {
    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Visitor " + name + ": My order is ready!");
    }
}
