package adapter;

//реализует тот интерфейс, который хочет клиент. Например, у нас нет объектов Duck и хотим заменить их объектами Turkey
public class TurkeyAdapter implements Duck {
    //обявляем ссылку
    Turkey turkey;

    //получаем ссылку на адаптируемый объект
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // индюшка не умеет летать на дальние расстояния, поэтому вызывем ее метод 5 раз
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    //подменяем квак утки индюшачьим криком
    @Override
    public void quack() {
        turkey.gobble();
    }
}
