package lab2example3;

public abstract class Piece {
	
	protected static Info[][] board=new Info[9][9];
	
	protected String name;
	public int x,y;
	public Piece(String name,int x,int y) {
		this.name=name;
		this.x=x;
		this.y=y;
	}
	
	 abstract boolean isLegalMove(int a,int b);
	 abstract void move(int a,int b);
	 
	 public boolean checkFirstTypeIllegalMoves(int posX,int posY) {
		 return (posX>8 || posY>8) || (posX<1 || posY<1) || (this.x==posX && this.y==posY);
	 }

	 public boolean checkDiagonals(int posX,int posY) {
		 if((this.x-posX)==(this.y-posY)) {
				if(this.x-posX<0) {
					for(int i=1;i<(posX-this.x);i++) {
						if(board[this.x+i][this.y+i].color!=Color.BLACK) return false;
					}return true;
				}else {
					for(int i=1;i<(this.x-posX);i++) {
						if(board[posX+i][posY+i].color!=Color.BLACK) return false;
					}return true;
				}
			}else if((this.x-posX)*-1==(this.y-posY)) {
				if(this.x-posX>0) {
					for(int i=1;i<this.x-posX;i++) {
						if(board[this.x-i][this.y+i].color!=Color.BLACK) return false;
					}return true;
				}else {
					for(int i=1;i<posX-this.x;i++) {
						if(board[this.x+i][this.y-i].color!=Color.BLACK) return false;
					}return true;
				}
			}
		 return false;
	 }
	 
	 public boolean cheakPawn(int posX,int posY,boolean firstMove) {
		 int direction=-1;
		 if(board[x][y].color==Color.WHITE) {
			 direction=1;
		 }
		 if(this.x==posX && this.y+direction*2==posY) {
				if(firstMove && ColorOfCell(posX,posY)==Color.BLACK) {
					return true;
				}else {
					return false;
				}
			}else if(this.x==posX && this.y+direction==posY) {
				if(ColorOfCell(posX,posY)==Color.BLACK) {
					return true;
				}else {
					return false;
				}
			}else if(Math.abs(this.x-posX)==1 && this.y+direction==posY) {
				if(ColorOfCell(posX,posY)!=Color.BLACK && ColorOfCell(posX,posY)!=ColorOfCell(this.x,this.y)) {
					return true;
				}return false;
				
			}
			return false;
	 }
	 
	 
	 public boolean checkHorizontal(int posX,int posY) {
		 if(posX==this.x) {
				if(posY>this.y) {
					for(int i=this.y+1;i<posY;i++) {
						if(board[posX][i].color!=Color.BLACK) {
							return false;
						}
					}return true;
				}else {
					for(int i=posY+1;i<this.y;i++) {
						if(board[posX][i].color!=Color.BLACK) {
							return false;
						}
					}return true;
				}
			}else if(posY==this.y) {
				if(posX>this.x) {
					for(int i=this.x+1;i<posX;i++) {
						if(board[i][posY].color!=Color.BLACK) {
							return false;
						}
					}return true;
				}else {
					for(int i=posX+1;i<this.x;i++) {
						if(board[i][posY].color!=Color.BLACK) {
							return false;
						}
					}return true;
				}
			}
			return false;
	 }
	 
	 public boolean knightIllegalMoveCheacker(int posX,int posY) {
			if(this.x-posX==2 || posX-this.x==2) {
				if(this.y-1==posY) {
					return true;
				}else if(this.y+1==posY) {
					return true;
				}
			}else if(this.y-posY==2 || posY-this.y==2 ) {
				if(this.x-1==posX) {
					return true;
				}else if(this.x+1==posX) {
					return true;
				}
			}
			return false;
	 }
	 
	 public Color ColorOfCell(int pos1,int pos2) {
		 return board[pos1][pos2].color;
	 }
	 public String toString() {
		 return this.name+" "+this.x+" "+this.y;
	 }
	 
}
