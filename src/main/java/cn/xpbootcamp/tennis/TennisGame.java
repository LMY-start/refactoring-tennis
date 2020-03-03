package cn.xpbootcamp.tennis;

abstract class TennisGame {
    protected Player playerOne;
    protected Player playerTwo;

    public TennisGame() {
        playerOne = new Player();
        playerTwo = new Player();
    }

    public TennisGame(String playerOneName, String playerTwoName) {
        playerOne = new Player(playerOneName);
        playerTwo = new Player(playerTwoName);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            playerOne.addPoint();
        } else {
            playerTwo.addPoint();
        }
    }

    abstract String getScore();
}