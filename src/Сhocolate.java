public class Сhocolate extends Product {
    private final String type;

    public Сhocolate(String name, Integer cost, String type) {
        super(name, cost);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }
}
