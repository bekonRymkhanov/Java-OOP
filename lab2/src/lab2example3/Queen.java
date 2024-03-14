package lab2example3;

public class Queen extends Piece{
	public Queen(int x,int y,Color color) {
		super("Quen",x,y);
		Piece.board[x][y].piece=this;
		Piece.board[x][y].color=color;
	}
	@Override
	boolean isLegalMove(int a, int b) {
		if(super.checkFirstTypeIllegalMoves(a, b)) return false;
		if(super.checkDiagonals(a, b) || (super.checkHorizontal(a, b)))
			return super.ColorOfCell(a, b)!=super.ColorOfCell(x,y);
		return false;
	}

	void move(int a, int b) {
		if(isLegalMove(a,b)) {
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
