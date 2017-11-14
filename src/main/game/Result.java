package main.game;

public enum Result {
    DRAW("draw"),;

    private final String gameresult;

    Result(String gameResult) {
        this.gameresult = gameResult;
    }

    public String getResult() {
        return gameresult;
    }
}
