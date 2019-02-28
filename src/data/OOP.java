package data;

public class OOP {
    public static void main(String[] args) {

        //person
        String name = "Oskar";
        String surname = "Polak";
        //



        String name1 = "Adam";
        String surname1 = "xxx";


        Person buyer = new Person("Kamil", "Zdroj", 22);
        Person seller = new Person("Wojtek", "Gwo", 32);

        buyer.eat();
        //buyer.surname = "asdasd";
        //System.out.println(buyer.surname);

        System.out.println(buyer.getName());
        System.out.println(seller.getName());

        Monster monster = new Monster("Orc", 1202, 200);
        Monster monster1 = new Monster("Orc", 1202, 200);


        if(monster.equals(monster1)){
            System.out.println("takie same!");
        }else{
            System.out.println("nie sa takie same");
        }

        if(monster == monster1){
            System.out.println("takie same!");
        }else{
            System.out.println("nie sa takie same");
        }

        System.out.println(monster.tryAttack());
        System.out.println(monster1.tryAttack());
    }
}
