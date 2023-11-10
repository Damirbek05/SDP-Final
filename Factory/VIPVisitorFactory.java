package Factory;

import Observer.Visitor;

public class VIPVisitorFactory implements VisitorFactory {
    @Override
    public Visitor createVisitor(String name) {
        return new VIPVisitor(name);
    }
}
