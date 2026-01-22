import java.util.*;

public class game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean flag = true;

        System.out.println("Welcome to Tic-Tac-Toe");

        while (flag) {

            // Print board
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + board[i][j] + " ");
                }
                System.out.println("|");
                System.out.println("-------------");
            }

            // Player move
            System.out.println(currentPlayer + " is playing now...");
            System.out.print("Enter row (1-3): ");
            int row = sc.nextInt();

            System.out.print("Enter col (1-3): ");
            int col = sc.nextInt();

            // Validation
            if (row < 1 || row > 3 || col < 1 || col > 3) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            if (board[row - 1][col - 1] != ' ') {
                System.out.println("Cell already occupied!");
                continue;
            }

            board[row - 1][col - 1] = currentPlayer;

            // Win check (rows & columns)
            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == currentPlayer &&
                     board[i][1] == currentPlayer &&
                     board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer &&
                     board[1][i] == currentPlayer &&
                     board[2][i] == currentPlayer)||
                    (board[0][0] == currentPlayer &&
                     board[1][1] == currentPlayer &&
                     board[2][2] == currentPlayer)) {

                    System.out.println(currentPlayer + " Wins!");
                    flag = false;
                }
            }

            // Switch player AFTER checking win
            if (flag) {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }
}
