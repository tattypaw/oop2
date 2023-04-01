public class Platypus extends Mammal implements Walkable, Swimmable{
    public Platypus(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ttt";
    }

    @Override
    public String feed() {
        return "Рыба, трава";
    }

    @Override
    public int runSpeed() {
        return 6;
    }

    @Override
    public int swimSpeed() {
        return 10;
    }

    @Override
    public int swimDepth() {
        return 5;
    }
}
