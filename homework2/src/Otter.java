public class Otter extends Predator implements  Swimible, Walkable{
    public Otter(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Aaaaaa";
    }

    @Override
    public int speedSwim() {
        return 15;
    }

    @Override
    public int speedForWalk() {
        return 10;
    }
}
