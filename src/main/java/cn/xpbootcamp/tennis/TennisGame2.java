package cn.xpbootcamp.tennis;

public class TennisGame2 extends TennisGame {

    public String getScore() {
        String P1res = "";
        String P2res = "";
        String score = "";
        int playerOnePoint = playerOne.getPoint();
        int playerTwoPoint = playerTwo.getPoint();
        if (playerOnePoint == playerTwoPoint && playerOnePoint < 4) {
            if (playerOnePoint == 0)
                score = "Love";
            if (playerOnePoint == 1)
                score = "Fifteen";
            if (playerOnePoint == 2)
                score = "Thirty";
            score += "-All";
        }
        if (playerOnePoint == playerTwoPoint && playerOnePoint >= 3)
            score = "Deuce";

        if (playerOnePoint > 0 && playerTwoPoint == 0) {
            if (playerOnePoint == 1)
                P1res = "Fifteen";
            if (playerOnePoint == 2)
                P1res = "Thirty";
            if (playerOnePoint == 3)
                P1res = "Forty";

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (playerTwoPoint > 0 && playerOnePoint == 0) {
            if (playerTwoPoint == 1)
                P2res = "Fifteen";
            if (playerTwoPoint == 2)
                P2res = "Thirty";
            if (playerTwoPoint == 3)
                P2res = "Forty";

            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (playerOnePoint > playerTwoPoint && playerOnePoint < 4) {
            if (playerOnePoint == 2)
                P1res = "Thirty";
            if (playerOnePoint == 3)
                P1res = "Forty";
            if (playerTwoPoint == 1)
                P2res = "Fifteen";
            if (playerTwoPoint == 2)
                P2res = "Thirty";
            score = P1res + "-" + P2res;
        }
        if (playerTwoPoint > playerOnePoint && playerTwoPoint < 4) {
            if (playerTwoPoint == 2)
                P2res = "Thirty";
            if (playerTwoPoint == 3)
                P2res = "Forty";
            if (playerOnePoint == 1)
                P1res = "Fifteen";
            if (playerOnePoint == 2)
                P1res = "Thirty";
            score = P1res + "-" + P2res;
        }

        if (playerOnePoint > playerTwoPoint && playerTwoPoint >= 3) {
            score = "Advantage player1";
        }

        if (playerTwoPoint > playerOnePoint && playerOnePoint >= 3) {
            score = "Advantage player2";
        }

        if (playerOnePoint >= 4 && playerTwoPoint >= 0 && (playerOnePoint - playerTwoPoint) >= 2) {
            score = "Win for player1";
        }
        if (playerTwoPoint >= 4 && playerOnePoint >= 0 && (playerTwoPoint - playerOnePoint) >= 2) {
            score = "Win for player2";
        }
        return score;
    }
}