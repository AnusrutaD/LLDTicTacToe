public class Board {
    int size;
    Piece[][] board;

    public Board(int size){
        this.size = size;
        board = new Piece[this.size][this.size];
    }

    public void display(){
        for (int i = 0; i < this.size; i++){
            for(int j = 0;j < this.size; j++) {
                if(board[i][j] == null){
                    System.out.print("_ ");
                }
                else{
                    System.out.print(board[i][j] + " ");
                }

            }
            System.out.println();
        }

    }

    public void play(int x, int y, Player player){
        if(this.board[x][y] != null){
            System.out.println("the position is already filled");
        }
        else{
            this.board[x][y] = player.piece;
        }
        this.display();
    }

//    public Player findWinner(){
//        // logic for find the winner
//    }
}
