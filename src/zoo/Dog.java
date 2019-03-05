package zoo;

public class Dog extends Animal implements Canine {


    public Dog(int id, String name, double weight) {
        super(id, name, weight);
    }

    @Override
    public void introduce() {
        System.out.println(getId() + " : " + "I'a a dog. My name is " + getName() + ", I weight " + getWeight());
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }

    public void sitPretty(){
        System.out.println(getName() + " sits pretty!!!!! <3");
    }
}
