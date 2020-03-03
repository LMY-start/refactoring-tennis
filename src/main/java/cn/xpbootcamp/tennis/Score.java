package cn.xpbootcamp.tennis;

public enum Score {
    LOVE("Love"), FIFTEEN("Fifteen"), THIRTY("Thirty"), FORTY("Forty"), DEUCE("Deuce");

    String value;

    Score(String value) {
        this.value = value;
    }

    public static String getScore(int point) {
        return values()[point].value;
    }

}
