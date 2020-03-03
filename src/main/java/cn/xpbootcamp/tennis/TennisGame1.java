package cn.xpbootcamp.tennis;

public class TennisGame1 extends TennisGame {


    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore;
        int playerOnePoint = playerOne.getPoint();
        int playerTwoPoint = playerTwo.getPoint();
        if (playerOnePoint == playerTwoPoint) {
            switch (playerOnePoint) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (playerOnePoint >= 4 || playerTwoPoint >= 4) {
            int minusResult = playerOnePoint - playerTwoPoint;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = playerOnePoint;
                else {
                    score.append("-");
                    tempScore = playerTwoPoint;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}