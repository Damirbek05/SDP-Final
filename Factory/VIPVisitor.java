package Factory;

import Observer.Visitor;

public class VIPVisitor extends Visitor {
    String name;
    public VIPVisitor(String name) {
        super(name);
    }

    @Override
    public void update() {

        System.out.println("VIP Visitor " + name + ": My special order is ready!");
    }
}