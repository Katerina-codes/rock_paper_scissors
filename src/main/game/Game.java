package main.game;

public class Game {
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        inputOutput.askUserForGameMode();
        String gameMode = inputOutput.getGameMode();

        if (gameMode.equals("1")) {
            inputOutput.askForMove("Player one");
            String playerOneMove = inputOutput.getMoveFromUser();
            Moves convertedPlayerOneMove = CommandLineUI.stringToEnum(playerOneMove);
            inputOutput.askForMove("Player two");
            String playerTwoMove = inputOutput.getMoveFromUser();
            Moves convertedPlayerTwoMove = CommandLineUI.stringToEnum(playerTwoMove);
            findWinner(convertedPlayerOneMove, convertedPlayerTwoMove);
        } else {
            inputOutput.askForMove("Player one");
            String playerOneMove = inputOutput.getMoveFromUser();
            Moves convertedPlayerOneMove = CommandLineUI.stringToEnum(playerOneMove);
            Moves playerTwoMove = ComputerPlayer.playRandomMove();
            inputOutput.displayComputerMove(playerTwoMove.getMove());
            findWinner(convertedPlayerOneMove, playerTwoMove);
        }
    }

        public void findWinner(Moves playerOneMove, Moves playerTwoMove) {
            String winningMove = rules.scoreGame(playerOneMove, playerTwoMove);
            inputOutput.announceWinner(winningMove);
        }
    }

