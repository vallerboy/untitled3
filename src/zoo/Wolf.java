package zoo;

public class Wolf extends Animal implements Canine {


    public Wolf(int id, String name, double weight) {
        super(id, name, weight);
    }

    @Override
    public void introduce() {
        System.out.println(getId() + " : " + "I'a a wolf. My name is " + getName() + ", I weight " + getWeight());
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }
}
