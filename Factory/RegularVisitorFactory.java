package Factory;

import Observer.Visitor;

public class RegularVisitorFactory implements VisitorFactory {
    @Override
    public Visitor createVisitor(String name) {
        return new Visitor(name);
    }
}
