package cn.xpbootcamp.tennis;

abstract class TennisGame {
    int playerOneScore = 0;
    int playerTwoScore = 0;

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.playerOneScore += 1;
        else
            this.playerTwoScore += 1;
    }

   abstract String getScore();
}