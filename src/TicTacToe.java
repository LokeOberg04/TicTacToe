public class TicTacToe {
    public static void main(String[] args) {
        char[] board = new char[9];
        int gameover = 0;
        System.out.println("Its your turn, X, Which place would you like to move to?");
for (int i = 0; i<9; i++) {
    board[i] = ' ';
}
while (gameover == 0) {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
        if (board[0] == board[1] && board[1] == board[2]) {
            System.out.println(board[0] + " wins!");
            gameover = 1;
        }
        else if (board[0] == board[4] && board[4] == board[8]) {
            System.out.println(board[0] + " wins!");
        }
        else if (board[0] == board[3] && board[3] == board[6]) {
            System.out.println(board[0] + " wins!");
        }
        else if (board[3] == board[4] && board[4] == board[5]) {
            System.out.println(board[3] + " wins!");
        }
        else if (board[6] == board[7] && board[7] == board[8]) {
            System.out.println(board[6] + " wins!");
        }
        else if (board[6] == board[4] && board[4] == board[2]) {
            System.out.println(board[6] + " wins!");
        }
        else if (board[1] == board[4] && board[4] == board[7]) {
            System.out.println(board[1] + " wins!");
        }
        else if (board[2] == board[5] && board[5] == board[8]) {
            System.out.println(board[2] + " wins!");
        }
        else {

        }
        }
    }
}
