package lab2example3;

public class Bishop extends Piece{
	public Bishop(int x,int y,Color color) {
		super("bish",x,y);
		Piece.board[x][y].piece=this;
		Piece.board[x][y].color=color;
	}
	
	
	boolean isLegalMove(int a, int b) {
		if(super.checkFirstTypeIllegalMoves(a, b)) return false;
		if(! super.checkDiagonals(a, b)) return false;
		return super.ColorOfCell(a, b)!=super.ColorOfCell(x,y);
	}

	@Override
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
