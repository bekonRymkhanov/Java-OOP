package lab2example3;

import java.util.Scanner;

import lab2.color;

public class Board {

	public static void main(String[] args) throws InterruptedException {
	    for (int i = 1; i < 9; i++) {
	        for (int j = 1; j < 9; j++) {
	            Piece.board[i][j] = new Info();
	        }
	    }
	    
		Scanner scan=new Scanner(System.in);

		Rock r1=new Rock(1,1,Color.WHITE);
		Rock r2=new Rock(8,1,Color.WHITE);
		Rock rr1=new Rock(1,8,Color.RED);
		Rock rr2=new Rock(8,8,Color.RED);
		King ki1=new King(5,1,Color.WHITE);
		King rki1=new King(5,8,Color.RED);
		Queen q1=new Queen(4,1,Color.WHITE);
		Queen rq1=new Queen(4,8,Color.RED);
		Bishop b1=new Bishop(3,1,Color.WHITE);
		Bishop b2=new Bishop(6,1,Color.WHITE);
		Bishop rb1=new Bishop(3,8,Color.RED);
		Bishop rb2=new Bishop(6,8,Color.RED);
		Knight kn1=new Knight(2,1,Color.WHITE);
		Knight kn2=new Knight(7,1,Color.WHITE);
		Knight rkn1=new Knight(2,8,Color.RED);
		Knight rkn2=new Knight(7,8,Color.RED);
		Pawn p1=new Pawn(1,2,Color.WHITE);
		Pawn p2=new Pawn(2,2,Color.WHITE);
		Pawn p3=new Pawn(3,2,Color.WHITE);
		Pawn p4=new Pawn(4,2,Color.WHITE);
		Pawn p5=new Pawn(5,2,Color.WHITE);
		Pawn p6=new Pawn(6,2,Color.WHITE);
		Pawn p7=new Pawn(7,2,Color.WHITE);
		Pawn p8=new Pawn(8,2,Color.WHITE);
		Pawn rp1=new Pawn(1,7,Color.RED);
		Pawn rp2=new Pawn(2,7,Color.RED);
		Pawn rp3=new Pawn(3,7,Color.RED);
		Pawn rp4=new Pawn(4,7,Color.RED);
		Pawn rp5=new Pawn(5,7,Color.RED);
		Pawn rp6=new Pawn(6,7,Color.RED);
		Pawn rp7=new Pawn(7,7,Color.RED);
		Pawn rp8=new Pawn(8,7,Color.RED);
		
		
		for(int i=8;i>0;i--) {
			System.out.print(i+"  ");
			for(int j=1;j<9;j++) {
 				Thread.sleep(1);
				if(Piece.board[j][i].color==Color.WHITE) {
	            	System.out.print(Piece.board[j][i].piece.name);
	    			Thread.sleep(1);
				}else if(Piece.board[j][i].color==Color.RED){
					System.err.print(Piece.board[j][i].piece.name);
					Thread.sleep(1);
				}else {
	            	System.out.print("    ");            
				}
            	System.out.print("||");            
			}
        	System.out.println();            
			System.out.print("___________________________________________________");
        	System.out.println();
		}
		System.out.println("     1     2     3     4     5     6     7     8");

		
		while(Piece.board[ki1.x][ki1.y].color==Color.WHITE && Piece.board[rki1.x][rki1.y].color==Color.RED) {
			int toMoveX=scan.nextInt();
			int toMoveY=scan.nextInt();
			
			int MovingX=scan.nextInt();
			int MovingY=scan.nextInt();
			if(Piece.board[toMoveX][toMoveY].color==Color.BLACK) {
				System.out.print("Hey");
				continue;
			}
			Piece.board[toMoveX][toMoveY].piece.move(MovingX, MovingY);

			for(int i=8;i>0;i--) {
				System.out.print(i+"  ");
				for(int j=1;j<9;j++) {
	 				Thread.sleep(1);
					if(Piece.board[j][i].color==Color.WHITE) {
		            	System.out.print(Piece.board[j][i].piece.name);
		    			Thread.sleep(1);
					}else if(Piece.board[j][i].color==Color.RED){
						System.err.print(Piece.board[j][i].piece.name);
						Thread.sleep(1);
					}else {
		            	System.out.print("    ");            
					}
	            	System.out.print("||");            
				}
	        	System.out.println();            
				System.out.print("___________________________________________________");
	        	System.out.println();
			}
			System.out.println("     1     2     3     4     5     6     7     8");

	    }
	}
}
