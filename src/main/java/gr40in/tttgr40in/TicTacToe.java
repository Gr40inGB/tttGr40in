package gr40in.tttgr40in;

import java.util.HashMap;

public class TicTacToe implements Game {
    static boolean gameIsRunned;

    boolean[][] tttDeskZero;
    boolean[][] tttDeskCross;
    int maxMoves = 3 * 3;
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

    private boolean checkDisk(boolean[][] arr) {
        if (currentMove > 4) {
            for (int i = 0; i < 3; i++) {
                if ((arr[i][0] && arr[i][1] && arr[i][2]) ||
                        arr[0][i] && arr[1][i] && arr[2][i])
                    return true;
            }
            return arr[0][0] && arr[1][1] && arr[2][2] ||
                    arr[2][0] && arr[1][1] && arr[0][2];
        }
        return false;
    }

    public void playerClicked (int x, int y, Player player){
        /// PlayerCross always start, every even move - it PlayerZero
        if ((currentMove++)%2==0){
            if (checkDisk(tttDeskCross)){
                showWinner(player);
            }
        }
        else if (checkDisk(tttDeskZero)){
            showWinner(player);
        }
    }

    @Override
    public Player showWinner(Player player) {
        return player;
    }

    @Override
    public boolean getGameRunnedStatus() {
        return gameIsRunned;
    }
}
