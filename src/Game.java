import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // initialize players
        Player player1 = new Player("Tony", new PieceX());
        Player player2 = new Player("Thanos", new PieceO());
        Board board = new Board(3);

        // Start the game
        board.display();
        Scanner input = new Scanner(System.in);
        int count = 0;

        Player playblePlayer = player1;
        while (count < 9){
            System.out.println("Hello " + playblePlayer.name + "! This is your turn");
            System.out.println("Please enter your x coordinate: ");
            int x = input.nextInt();

            System.out.println("Please enter your y coordinate: ");
            int y = input.nextInt();
            board.play(x, y, playblePlayer);
            if(playblePlayer.equals(player1)){
                playblePlayer = player2;
            }
            else {
                playblePlayer = player1;
            }
            count++;
        }
    }
}
