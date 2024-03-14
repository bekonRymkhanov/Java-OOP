package lab2example3;

public class King extends Piece{
	public boolean firsMoveDone=false;
	public King(int x,int y,Color color) {
		super("king",x,y);
		Piece.board[x][y].piece=this;
		Piece.board[x][y].color=color;
	}
	
	boolean isLegalMove(int a, int b) {
		if((Math.abs(a-this.x)>1 || Math.abs(b-this.y)>1) || super.checkFirstTypeIllegalMoves(a, b)) return false;
		return super.ColorOfCell(a, b)!=super.ColorOfCell(x,y);
		
	}

	void move(int a, int b) {
		if(isLegalMove(a,b)) {
			this.firsMoveDone=true;
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
