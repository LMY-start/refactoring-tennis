package cn.xpbootcamp.tennis;

public class TennisGame3 extends TennisGame {


    public TennisGame3(String playerOneName, String playerTwoName) {
        super(playerOneName, playerTwoName);
    }

    public String getScore() {
        String s;
        int playerOnePoint = playerOne.getPoint();
        int playerTwoPoint = playerTwo.getPoint();
        if (playerOnePoint < 4 && playerTwoPoint < 4 && playerOnePoint + playerTwoPoint != 6) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[playerOnePoint];
            return (playerOnePoint == playerTwoPoint) ? s + "-All" : s + "-" + p[playerTwoPoint];
        } else {
            if (playerOnePoint == playerTwoPoint)
                return "Deuce";
            s = playerOnePoint > playerTwoPoint ? playerOne.getName() : playerTwo.getName();
            return ((playerOnePoint - playerTwoPoint) * (playerOnePoint - playerTwoPoint) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }


}