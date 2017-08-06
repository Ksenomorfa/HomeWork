package simplefabric;

public abstract class Pizza {
    public String name;

    public String getName() {
        return this.name;
    }

    public void prepare() {

    }
    void bake() {
        System.out.println("Pizza is baked.");
     }
    void cut() {
        System.out.println("Pizza is cutted");

    }
    void box() {
        System.out.println("Pizza is boxed.");

    }

}
