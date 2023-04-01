public class Walrus extends Predator implements Swimmable{

    private int speed;
    private int depth;
    public Walrus(String name, int speed, int depth) {
        super(name);
        this.speed = speed;
        this.depth = depth;
    }


    @Override
    public String speak() {
        return "Fffr-tuuu";
    }

    @Override
    public int swimSpeed() {
        return speed;
    }

    @Override
    public int swimDepth() {
        return depth;
    }

    @Override
    public String feed() {
        return "Рыба, моллюски";
    }
}
