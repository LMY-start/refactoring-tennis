package cn.xpbootcamp.tennis;

import static java.lang.Math.abs;

public class TennisGame {
    protected Player playerOne;
    protected Player playerTwo;

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

    public String getScore() {
        int playerOnePoint = playerOne.getPoint();
        int playerTwoPoint = playerTwo.getPoint();
        if (playerOnePoint < 4 && playerTwoPoint < 4 && playerOnePoint + playerTwoPoint != 6) {
            return (playerOnePoint == playerTwoPoint)
                    ? Score.getScore(playerOnePoint)
                    + "-All" : Score.getScore(playerOnePoint) + "-" + Score.getScore(playerTwoPoint);
        } else {
            if (playerOnePoint == playerTwoPoint)
                return Score.DEUCE.value;
            String player = playerOnePoint > playerTwoPoint ? playerOne.getName() : playerTwo.getName();
            return (abs(playerOnePoint - playerTwoPoint) == 1) ? "Advantage " + player : "Win for " + player;
        }
    }
}