package simuduck;

import simuduck.quackbehavior.Quack;
import simuduck.quackbehavior.QuackBehavior;

public class Hunter {
    String name;
    QuackBehavior quackBehavior;

    public Hunter(String name) {
        this.name = name;
        this.quackBehavior = new Quack();
    }

    public void callQuack() {
        quackBehavior.quack();
    }
}
