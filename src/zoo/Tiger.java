package zoo;

public class Tiger extends Animal {
    private int clawLength;

    public Tiger(int id, String name, double weight, int clawLength) {
        super(id, name, weight);
        this.clawLength = clawLength;
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }

    @Override
    public void introduce() {
        System.out.println(getId() + " : " + "I'a a tiger. My name is " + getName() + ", I weight " + getWeight());
    }
}
