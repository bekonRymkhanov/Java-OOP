package lab2example3;

public class Pawn extends Piece{
	boolean firstMove=true;
	public Pawn(int x,int y,Color color) {
		super("pawn",x,y);
		Piece.board[x][y].piece=this;
		Piece.board[x][y].color=color;
	}
	@Override
	boolean isLegalMove(int a, int b) {
		if(super.checkFirstTypeIllegalMoves(a, b)) return false;
		if(!super.cheakPawn(a, b, firstMove)) return false;
		return true;
		
	}

	@Override
	void move(int a, int b) {
		if(isLegalMove(a,b)) {
			firstMove=false;
			board[this.x][this.y].piece=null;
			board[a][b].color=board[this.x][this.y].color;
			board[this.x][this.y].color=Color.BLACK;
			board[a][b].piece=this;
			this.x=a;
			this.y=b;
		}else {
			System.out.print("Hey!");
		}
	}
	 public String toString() {
		 return super.toString();
	 }
}
