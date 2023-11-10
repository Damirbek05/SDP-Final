package Factory;

import Observer.Visitor;

public interface VisitorFactory {
    Visitor createVisitor(String name);
}
