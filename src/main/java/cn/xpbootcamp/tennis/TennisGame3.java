package cn.xpbootcamp.tennis;

public class TennisGame3 extends TennisGame {

    private String playerOneName;
    private String playerTwoName;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getScore() {
        String s;
        if (playerOneScore < 4 && playerTwoScore < 4 && !(playerOneScore + playerTwoScore == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[playerOneScore];
            return (playerOneScore == playerTwoScore) ? s + "-All" : s + "-" + p[playerTwoScore];
        } else {
            if (playerOneScore == playerTwoScore)
                return "Deuce";
            s = playerOneScore > playerTwoScore ? playerOneName : playerTwoName;
            return ((playerOneScore - playerTwoScore)*(playerOneScore - playerTwoScore) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }


}