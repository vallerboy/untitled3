package task1slack;

public class Main {
    public static void main(String[] args) {


        Lottery lottery = new Lottery("Lotto", 7);
        lottery.addPlayer(new Player("asdasd", 2));


        System.out.println(lottery.lottery());
    }
}
