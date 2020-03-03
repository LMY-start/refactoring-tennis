package cn.xpbootcamp.tennis;

import static java.lang.Math.abs;

public class TennisGame3 extends TennisGame {


    public TennisGame3(String playerOneName, String playerTwoName) {
        super(playerOneName, playerTwoName);
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