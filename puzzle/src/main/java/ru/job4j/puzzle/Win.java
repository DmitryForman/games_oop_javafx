package ru.job4j.puzzle;

public class Win {

    public static boolean horizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean vertical (int[][] board, int column) {
        boolean result = true;
        for (int[] ints : board) {
            if (ints[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean check (int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (horizontal(board, i)) || vertical(board, i)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
