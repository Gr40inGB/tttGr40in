package gr40in.tttgr40in;

import java.util.HashMap;

public class TicTacToe implements Game {
    static boolean gameIsRunned;

    boolean[][] tttDeskZero;
    boolean[][] tttDeskCross;
    int maxMoves = 3*3;
    int currentMove;

    Player playerZero;
    Player playerCross;

    public TicTacToe(Player playerZero, Player playerCross) {
        this.tttDeskZero = new boolean[3][3];
        this.tttDeskCross = new boolean[3][3];
        this.currentMove = 0;

        this.playerZero = playerZero;
        this.playerCross = playerCross;
    }

    private boolean CheckDisk() {
        return false;
    }

    @Override
    public Player showWinner() {
        return null;
    }

    @Override
    public boolean getGameRunnedStatus() {
        return gameIsRunned;
    }
}
