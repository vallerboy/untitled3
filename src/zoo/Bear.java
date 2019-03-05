package zoo;

public class Bear extends Animal {

    private int furLength;

    public Bear(int id, String name, double weight, int furLength) {
        super(id, name, weight);
        this.furLength = furLength;
    }

    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println(getId() + " : " + "I'a a bear. My name is " + getName() + ", I weight " + getWeight());
    }
}
