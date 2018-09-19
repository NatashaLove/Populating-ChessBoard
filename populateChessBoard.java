import java.util.*;
import ChessPiece.*;

public class  populateChessBoard {
	
	public static void main (String [] args) {
	
		ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>(32); //create 32 pieces, 16 for both players
		//ChessPiece<String> pieces = new ArrayList<String>(32);
		
		// Add pieces to array list.
		//boolean add(Object o) : This method appends the specified element to the end of the arr list. 
		//.add - method for arrays - here creates array of objs of class ChessPiece
	
	
		//void createPieces() {
			//add eight pawns for both colors
			for (int i=0; i<8; i++) { 
				// constructor: ChessPiece(String color, String name, int row, int column)
				pieces.add(new ChessPiece("B", "P", i, 1)); //black pawns to 2nd highest row 
				pieces.add(new ChessPiece("W", "P", i, 6)); //white pawns to 2nd lowest row
			}
			// Create new objects (chess pieces) with help of constructor
			//populate rooks
			pieces.add(new ChessPiece("B", "R", 0, 0)); //black rook on upper left
			pieces.add(new ChessPiece("B", "R", 7, 0)); //black rook on upper right
			pieces.add(new ChessPiece("W", "R", 0, 7)); //white rook on down left
			pieces.add(new ChessPiece("W", "R", 7, 7)); //white rook on down right
			//populate knights
			pieces.add(new ChessPiece("B", "N", 1, 0)); //black knight on upper 2nd left
			pieces.add(new ChessPiece("B", "N", 6, 0)); //black knight on upper 2nd right
			pieces.add(new ChessPiece("W", "N", 1, 7)); //white knight on down 2nd left
			pieces.add(new ChessPiece("W", "N", 6, 7)); //white knight on down 2nd right
			//populate bishops
			pieces.add(new ChessPiece("B", "B", 2, 0)); //black bishop on upper 3rd left
			pieces.add(new ChessPiece("B", "B", 5, 0)); //black bishop on upper 3rd right
			pieces.add(new ChessPiece("W", "B", 2, 7)); //white bishop on down 3rd left
			pieces.add(new ChessPiece("W", "B", 5, 7)); //white bishop on down 3rd right
			//populate queens
			pieces.add(new ChessPiece("B", "Q", 3, 0)); //black queen on upper 4rd left
			pieces.add(new ChessPiece("W", "Q", 3, 7)); //white queen on down 4rd left
			//populate kings
			pieces.add(new ChessPiece("B", "K", 4, 0)); //black king on upper 5th left
			pieces.add(new ChessPiece("W", "K", 4, 7)); //white king on down 5th left
		//}

		// prints all the elements available in list 
		
		//System.out.println(pieces);
		
		
	// System.out.println(prnt);
		
        for (ChessPiece piece : pieces) { 
		
			String print = piece.printInfo();
            System.out.println(" " + print + " ");  
        } 
	
	}
 }
 
 
 
 
 // ChessPiece wPawn = new ChessPiece();	
		
	// wPawn.setPieceType(" pawn");
	// wPawn.setColor("white ");
	// wPawn.setPosition(1,2);
	
	// String prnt = wPawn.printInfo();
	// System.out.println(prnt);
	
	// ChessPiece bPawn = new ChessPiece();	
	
	// bPawn.setPieceType(" pawn");
	// bPawn.setColor("black ");
	// bPawn.setPosition(7,6);
	
	// prnt = bPawn.printInfo();
	// System.out.println(prnt);