package TicTacToe;

import static TicTacToe.Mark.E;

public class Board {
    public static void main(String[] args) {
        displayBoard();
    }
    private static final Mark[][]boardFace = {{E,E,E}, {E,E,E},{E,E,E}};

    public Mark[][] getBoardFace() {
        return boardFace;
    }

    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(boardFace[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
