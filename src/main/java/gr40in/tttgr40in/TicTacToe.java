package gr40in.tttgr40in;

import java.util.HashMap;

public class TicTacToe implements Game{
    static boolean gameIsRunned;

    int [][] tttDesk;
    Player playerZero;
    Player playerCross;

    public TicTacToe(int[][] tttDesk, Player playerZero, Player playerCross) {
        this.tttDesk = new int[3][3];
        this.playerZero = playerZero;
        this.playerCross = playerCross;
    }

    private boolean CheckDisk(){
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
