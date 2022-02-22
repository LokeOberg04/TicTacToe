import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[] board = new char[9];
        int play = 0;
        char turn = 'o';
        System.out.println("Its your turn, X, Which place would you like to move to?");
for (int i = 0; i<9; i++) {
    board[i] = ' ';
}
for (int round = 0; round < 9; round++) {
        if (turn == 'o'){
            turn = 'x';
        }
        else {
            turn = 'o';
        }
        System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);

        System.out.println("where do you want to play?");
        Scanner scan = new Scanner(System.in);
        play = Integer.parseInt(scan.nextLine());
        play = play - 1;
        board[play] = turn;

        if (board[0] == board[1] && board[1] == board[2] && board[0] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[0] + " wins!");
            round = 9;
        }
        else if (board[0] == board[4] && board[4] == board[8] && board[0] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[0] + " wins!");
            round = 9;
        }
        else if (board[0] == board[3] && board[3] == board[6] && board[0] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[0] + " wins!");
            round = 9;
        }
        else if (board[3] == board[4] && board[4] == board[5] && board[3] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[3] + " wins!");
            round = 9;
        }
        else if (board[6] == board[7] && board[7] == board[8] && board[6] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[6] + " wins!");
            round = 9;
        }
        else if (board[6] == board[4] && board[4] == board[2] && board[6] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[6] + " wins!");
            round = 9;
        }
        else if (board[1] == board[4] && board[4] == board[7] && board[1] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[1] + " wins!");
            round = 9;
        }
        else if (board[2] == board[5] && board[5] == board[8] && board[2] != ' ') {
            System.out.println("\n\n\n\n\nIts your turn, " + turn + ", Which place would you like to move to?\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8]);
            System.out.println(board[2] + " wins!");
            round = 9;
        }
        else {

        }
        }
    }
}
