package designpatterns.singleton;

public class B extends A {

    private B() {
        super(B.class);
    }
}