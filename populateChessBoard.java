import java.util.*;
import ChessPiece.*;

public class  populateChessBoard {
	
	public static void main (String [] args) {
	
		ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>(32); //create 32 pieces, 16 for both players
		
		// Add pieces to array list.
		//boolean add(Object o) : This method appends the specified element to the end of the arr list. 
		//.add - method for arrays - here creates array of objs of class ChessPiece
	
	
		//void createPieces() {
			//add eight pawns for both colors
			for (int i=0; i<8; i++) { 
				// constructor: ChessPiece(String color, String name, int row, int column)
				pieces.add(new ChessPiece("B", "P", 1, i)); //black pawns to 2nd highest row 
				pieces.add(new ChessPiece("W", "P", 6, i)); //white pawns to 2nd lowest row
			}
			// Create new objects (chess pieces) with help of constructor
			//populate rooks
			pieces.add(new ChessPiece("B", "R", 0, 0)); //black rook on upper left
			pieces.add(new ChessPiece("B", "R", 0, 7)); //black rook on upper right
			pieces.add(new ChessPiece("W", "R", 7, 0)); //white rook on down left
			pieces.add(new ChessPiece("W", "R", 7, 7)); //white rook on down right
			//populate knights
			pieces.add(new ChessPiece("B", "N", 0, 1)); //black knight on upper 2nd left
			pieces.add(new ChessPiece("B", "N", 0, 6)); //black knight on upper 2nd right
			pieces.add(new ChessPiece("W", "N", 7, 1)); //white knight on down 2nd left
			pieces.add(new ChessPiece("W", "N", 7, 6)); //white knight on down 2nd right
			//populate bishops
			pieces.add(new ChessPiece("B", "B", 0, 2)); //black bishop on upper 3rd left
			pieces.add(new ChessPiece("B", "B", 0, 5)); //black bishop on upper 3rd right
			pieces.add(new ChessPiece("W", "B", 7, 2)); //white bishop on down 3rd left
			pieces.add(new ChessPiece("W", "B", 7, 5)); //white bishop on down 3rd right
			//populate queens
			pieces.add(new ChessPiece("B", "Q", 0, 3)); //black queen on upper 4rd left
			pieces.add(new ChessPiece("W", "Q", 7, 3)); //white queen on down 4rd left
			//populate kings
			pieces.add(new ChessPiece("B", "K", 0, 4)); //black king on upper 5th left
			pieces.add(new ChessPiece("W", "K", 7, 4)); //white king on down 5th left
		//}

		// prints all the elements available in list 
        for (ChessPiece piece : pieces) { 
            System.out.println(" " + piece + " "); 
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