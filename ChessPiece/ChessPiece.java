package ChessPiece;

public class ChessPiece {
	
	// color - white 0, black 1
	String color;
	// type of chess piece
	String name; 
	// row and column for position on the board
	private int column; 
	private int row;
	
	
	// Default constructor.
	public ChessPiece() {
	}
	
	//Constructor. Defines piece color, type and position.
	
	public ChessPiece(String color, String name, int row, int column) {
		this.color = color;
		this.name = name;
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
		
	}

	public String getRowAcronym() {
		String acro = "";
		
		switch (getRow()) {
		case 0:
			acro = "a";
			break;
		case 1:
			acro = "b";
			break;
		case 2:
			acro = "c";
			break;
		case 3:
			acro = "d";
			break;
		case 4:
			acro = "e";
			break;
		case 5:
			acro = "f";
			break;	
		case 6:
			acro = "g";
			break;
		case 7:	
			acro = "h";
			break;			
		default:
			break;	
		}
		return acro;
	}
	
	
	public int getCol() {
		return column;
	}

	public void setCol(int column) {
		this.column = column;
	}
	
	//in order to return multiple values - use array:
    public String[] getPosition(){
		
		//locating memory for 2 new vars - position 2D
		String position[] = new String [2];
		
		//convert int to string
		String columnAsString = Integer.toString(column);
		String rowAsString = Integer.toString(row);
		position[0]=columnAsString;
		position[1]=rowAsString;
	
	// returns MEMORY LOCATIONS of array elements! ([Ljava.lang.String;@15db9742)
		return position;
	}
	
    public void setPosition(int column, int row){	
		this.column=column;
		this.row=row;
	}
	
	public String getColor(){
	   return color;
    }
	
	public void setColor(String color){
		this.color=color;
	}
	
    public String getPieceType(){
		return name;
	}
	
    public void setPieceType(String name){
	   this.name=name;
    }
	
	
	//to print 2 returned values of array (not memory location) use additional: var []= getPosition();
	//and type every element of array in text + position [0]+...;
	
	public String printInfo(){
		String position[]= getPosition();

		return "\nYour chess piece is a " + getColor() + getPieceType() + 
		" \nChess position is x/column:" + position[0] + " and y/row: " + position[1]+ "\n"; // = getPosition() - but this returns MEMORY LOCATION!!!
		// 	INSTEAD OF:  return "Your chess piece is " + getColor() + getPieceType() + 
		//!!! GETPOSITION(); !!!

	}

}