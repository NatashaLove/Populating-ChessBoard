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
				pieces.add(new ChessPiece("B", "P", i, 1)); //black pawns to 2nd row 
				pieces.add(new ChessPiece("W", "P", i, 6)); //white pawns to 7 row
			}
			// Create new objects (chess pieces) with help of constructor
			//populate rooks
			pieces.add(new ChessPiece("B", "R", 0, 0)); //black rook a1
			pieces.add(new ChessPiece("B", "R", 7, 0)); //black rook h1
			pieces.add(new ChessPiece("W", "R", 0, 7)); //white rook a8
			pieces.add(new ChessPiece("W", "R", 7, 7)); //white rook h8
			//populate knights
			pieces.add(new ChessPiece("B", "N", 1, 0)); //black knight b1
			pieces.add(new ChessPiece("B", "N", 6, 0)); //black knight g1
			pieces.add(new ChessPiece("W", "N", 1, 7)); //white knight b8
			pieces.add(new ChessPiece("W", "N", 6, 7)); //white knight g8
			//populate bishops
			pieces.add(new ChessPiece("B", "B", 2, 0)); //black bishop c1
			pieces.add(new ChessPiece("B", "B", 5, 0)); //black bishop f1
			pieces.add(new ChessPiece("W", "B", 2, 7)); //white bishop c8
			pieces.add(new ChessPiece("W", "B", 5, 7)); //white bishop f8
			//populate queens
			pieces.add(new ChessPiece("B", "Q", 3, 0)); //black queen d1
			pieces.add(new ChessPiece("W", "Q", 3, 7)); //white queen d8
			//populate kings
			pieces.add(new ChessPiece("B", "K", 4, 0)); //black king e1
			pieces.add(new ChessPiece("W", "K", 4, 7)); //white king e8
		//}

		// prints all the elements available in list 
		
		//System.out.println(pieces);// but this prints memory location
		
		// System.out.println(prnt);
		
		
		// This loop prints elements from array list (with printInfo() method from he ChessPiece class
		
		/* such FOR loop (with condition like 
		
        for (Integer number : arrlist) { 
            System.out.println("Number = " + number); 
        } 
		// prints all the elements available in list  - BUT USED ONLY for ARRAYS!!!
		*/
		
        for (ChessPiece piece : pieces) { 
		
			String print = piece.printInfo();
            System.out.println(" " + print + " ");  
        } 
		
		/*
		
		'for (thing : listOfThigs)' - is basically shorthand for =
		`for(int i = 0; i < listOfThings.length; i++){ thing = listOfThings[i]}`
		-ONLY for-loop and in Java
		*/
	
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