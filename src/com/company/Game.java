package com.company;

import java.util.Scanner;

public class Game {

    private int[] board;
    private int[][] winCombinations;

    public Game() {
        board = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        winCombinations = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

        makeMove('X', askMove('X'));
    }

    // Draws the board to the console
    private void drawBoard() {
        //TODO: Draw the board
        System.out.println(board[0] + "|");
    }

    // Given a player, returns the other player
    private char otherPlayer(char player) {
        if (player == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }

    // This method asks the player for a move input and inserts its mark at that location. It verifies the input is correct and after making the move, it checks if that move was a winning move. If not, this function initiates the next move by calling itself.
    private void makeMove(char player, int move) {

    }

    // This method asks the player where to move using the input() function and validates the answer. It returns the move. A move is valid if: it is greater than or equal to 0, less than or equal to 8, and has not already been done
    private int askMove(char player) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Player " + player + ": ");
                String strMove = sc.nextLine();
                int move = Integer.valueOf(strMove);

                // TODO: Check for valid move, return only if valid. Current if is a placeholder. You may need more ifs, you may not
                if (false) {
                    return move;
                }

                System.out.println("\n That's invalid. Try again.");
            } catch (ClassCastException e) {
                System.out.println("\n That's not a number. Try again.");
            }

        }
    }

    // This method checks for a win or tie condition and is called after every move. Return true if the game ends, false otherwise
    private boolean checkWin(char player) {
        // TODO: check for a win

        // TODO: check for a tie

        // No one won, return false
        return false;
    }
}
