package main.practice.game_x_o;

import java.util.Scanner;

public class Game {
    char[][] board;
    final char X = 'X';
    final char O = 'O';
    final char EMPTY = ' ';
    Scanner sc;

    public Game() {
        board = new char[3][3];
        sc = new Scanner(System.in);
    }

    void playingField() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    void initPlayingField() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                board[row][col] = EMPTY;
    }

    void playerActionOne() {
        int x, y;
        do {
            System.out.println("The first player moves. Enter X and Y (1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        board[y][x] = X;
    }

    void playerActionTwo() {
        int x, y;
        do {
            System.out.println("Second player's move. Enter X and Y (1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        board[y][x] = O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3)
            return false;
        return board[y][x] == EMPTY;
    }

    boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((board[i][0] == dot && board[i][1] == dot &&
                    board[i][2] == dot) ||
                    (board[0][i] == dot && board[1][i] == dot &&
                            board[2][i] == dot))
                return true;
        if ((board[0][0] == dot && board[1][1] == dot &&
                board[2][2] == dot) ||
                (board[2][0] == dot && board[1][1] == dot &&
                        board[0][2] == dot))
            return true;
        return false;
    }

    boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (board[row][col] == EMPTY)
                    return false;
        return true;
    }

    void game() {
        initPlayingField();
        while (true) {
            playerActionOne();
            if (checkWin(X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            playerActionTwo();
            playingField();
            if (checkWin(O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        playingField();
    }

    public static void main(String[] args) {
        new Game().game();
    }


}
