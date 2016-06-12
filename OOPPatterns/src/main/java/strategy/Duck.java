package strategy;
/*Реализация паттерна Стратегия (поведение инкапсулируется в отдельные интерфейсы, реализуемые в отдельных
классах поведения. Конкретная реализация определяется динамически. Абстрактный класс содержит интерфейсы поведения,
а его наследники создаются с конкретным классом поведения.*/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All strategy float.");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
