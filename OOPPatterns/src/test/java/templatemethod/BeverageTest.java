package templatemethod;

public class BeverageTest{

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Preparing Tea");
        tea.prepareReceipe();

        System.out.println("Preparing Coffee");
        coffee.prepareReceipe();
    }
}
