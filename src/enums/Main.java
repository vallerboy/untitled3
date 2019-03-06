package enums;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Oksa", "Polak", Gender.MEN);

        Gender someGender = Gender.MEN;
        System.out.println(someGender);


        switch (someGender){
            case MEN: {
                System.out.println("MEN!");
                break;
            }
            case WOMEN: {
                System.out.println("WOEMEN");
                break;
            }
        }
    }
}
