package singleton;

class Singleton {
    //статическая переменнная с volatile, чтобы параллельные потоки правильно работали с переменной
    private volatile static Singleton uniqueInstance;

    // приватный конструктор
    private Singleton() {
        System.out.println("Это я, и я один.");
    }

    //метод создания объекта, проверяющего есть ли уже такой объект.
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            //этот кусок кода синхронизируется только если экземпляра не существует.
            synchronized (Singleton.class) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
