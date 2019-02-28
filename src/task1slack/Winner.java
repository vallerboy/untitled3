package task1slack;

public class Winner {
    private Player winner;
    private int percentOfAgeWinners;

    public Winner(Player winner, int percentOfAgeWinners) {
        this.winner = winner;
        this.percentOfAgeWinners = percentOfAgeWinners;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getPercentOfAgeWinners() {
        return percentOfAgeWinners;
    }

    public void setPercentOfAgeWinners(int percentOfAgeWinners) {
        this.percentOfAgeWinners = percentOfAgeWinners;
    }
}
