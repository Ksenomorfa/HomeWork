package strategy;

abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck() {

    }
    public abstract void display();
    void performFly() {
        flyBehavior.fly();
    }
    void performQuack(){
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All strategy float.");
    }

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
